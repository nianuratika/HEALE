package com.example.user.HealeApps.disease;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import com.example.user.HealeApps.R;

public class penyakit extends AppCompatActivity {
    protected ListView lv;
    protected ListAdapter adapter;
    SQLiteDatabase db;
    Cursor cursor;
    EditText et_db;

    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitydisease);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarid);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        db = (new Databasepenyakit(this)).getWritableDatabase();
        lv = (ListView) findViewById(R.id.lv);
        et_db =(EditText) findViewById(R.id.et);

        try{
            cursor = db.rawQuery("SELECT * FROM sam ORDER BY nama ASC", null);
            adapter = new SimpleCursorAdapter(this, R.layout.isi_lvdisease, cursor, new String[] {"nama", "penyebab", "img"}, new int[] {R.id.tv_nama, R.id.tv_penyebab, R.id.imV});
            lv.setAdapter(adapter);
            lv.setTextFilterEnabled(true);
            lv.setOnItemClickListener(new OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView parent, View v,
                                        int position, long id) {
                    detail(position);}
            });
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @SuppressWarnings("deprecation")
    public void search_db(View v){
        String edit_db = et_db.getText().toString();
        if(!edit_db.equals("")){
            try{
                cursor = db.rawQuery("SELECT * FROM sam WHERE nama LIKE ?", new String[] {"%" +edit_db+ "%"});
                adapter = new SimpleCursorAdapter(this, R.layout.isi_lvdisease, cursor, new String[] {"nama", "penyebab", "img"}, new int[] {R.id.tv_nama, R.id.tv_penyebab, R.id.imV});
                if(adapter.getCount() == 0){
                    Toast.makeText(this, "Tidak ditemukan data dengan kata kunci "+edit_db+"", Toast.LENGTH_SHORT).show();
                }else{
                    lv.setAdapter(adapter);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            try{
                cursor = db.rawQuery("SELECT * FROM sam ORDER BY nama ASC", null);
                adapter = new SimpleCursorAdapter(this, R.layout.isi_lvdisease, cursor, new String[] {"nama", "penyebab", "img"}, new int[] {R.id.tv_nama, R.id.tv_penyebab, R.id.imV});
                lv.setAdapter(adapter);
                lv.setTextFilterEnabled(true);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public void detail(int position){
        int im = 0;
        String _id = "";
        String nama = "";
        String penyebab = "";
        String gejala = "";
        String description = "";


        if(cursor.moveToFirst()){
            cursor.moveToPosition(position);
            im = cursor.getInt(cursor.getColumnIndex("img"));
            nama = cursor.getString(cursor.getColumnIndex("nama"));
            penyebab = cursor.getString(cursor.getColumnIndex("penyebab"));
            gejala = cursor.getString(cursor.getColumnIndex("gejala"));
            description = cursor.getString(cursor.getColumnIndex("description"));

        }

        Intent iIntent = new Intent(this, detailpenyakit.class);
        iIntent.putExtra("dataIM", im);
        iIntent.putExtra("dataNama", nama);
        iIntent.putExtra("dataPenyebab", penyebab);
        iIntent.putExtra("dataGejala", gejala);
        iIntent.putExtra("dataDescription", description);


        setResult(RESULT_OK, iIntent);
        startActivityForResult(iIntent, 99);
    }

}