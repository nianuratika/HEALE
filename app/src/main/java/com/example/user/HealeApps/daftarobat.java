package com.example.user.HealeApps;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;


public class daftarobat extends Activity {

    ListView listview;
    CustomAdapter adapter;
    ArrayList<String> records;
    SQLiteDB dbhelper;
    //Button btntambahdata_Period;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarobat);


        //final Shader shader = new LinearGradient(0, 0, 0, 20,
        //        new int[]{Color.GREEN,Color.BLUE},
        //        new float[]{0, 1}, Shader.TileMode.CLAMP
        //);

        listview=(ListView)findViewById(R.id.pro_lsit);
        records=new ArrayList<String>();
        adapter=new CustomAdapter(this,R.layout.list_item,R.id.tempatid,records);
        listview.setAdapter(adapter);
        dbhelper=new SQLiteDB(this);

        // final TextView txt_data_pasien1 = (TextView) findViewById(R.id.txt_data_pasien);
        // txt_data_pasien1.getPaint().setShader(shader);



    }

    public void onStart(){
        super.onStart();
        insertSampleData();
        readSampleData();
        countRecords_period();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void readSampleData(){
        //MEMBUKA DATABASE
        SQLiteDatabase database=dbhelper.getReadableDatabase();
        String sql="SELECT * FROM "+ SQLiteDB.MYDATABASE_TABLE;

        //MEMBUAT KURSOR UNTUK MEMBUKA DATABASE
        Cursor c=database.rawQuery(sql,null);
        String isicatatan, isiobat, isimoods;
        int id;
        if(c.getCount()>0)
            while(c.moveToNext()){
                id=c.getInt(c.getColumnIndex(SQLiteDB.KEY_ID));
                isicatatan=c.getString(c.getColumnIndex(SQLiteDB.KEY_NOTES));
                isiobat=c.getString(c.getColumnIndex(SQLiteDB.KEY_MEDICINE));
                isimoods=c.getString(c.getColumnIndex(SQLiteDB.KEY_MOODS));

                String item=id+"__"+isicatatan+"__"+isiobat+"__"+isimoods;
                records.add(item);

            }
        //notify listview of dataset changed
        adapter.notifyDataSetChanged();
    }

    //MEMASUKKAN SAMPLE DATA
    public void insertSampleData(){
        //get a writable database
        SQLiteDatabase database = dbhelper.getWritableDatabase();


    }

    // HAPUS DATA DARI TABEL
    public void deleteRow(View view){
        Button bt=(Button)view;
        final String del_id1=bt.getTag().toString();

        //MENAMPILKAN PERINGATAN MENGHAPUS DATA
        AlertDialog.Builder alertDialogHapus = new AlertDialog.Builder(daftarobat.this);
        alertDialogHapus.setTitle("Hapus Data");
        alertDialogHapus.setMessage("Anda yakin ingin menghapus data ini?");
        //KALAU YAKIN HAPUS
        alertDialogHapus.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {

                SQLiteDatabase database = dbhelper.getWritableDatabase();
                database.delete(SQLiteDB.MYDATABASE_TABLE, SQLiteDB.KEY_ID + "=?", new String[]{del_id1});
                for (int i = 0; i < records.size(); i++) {
                    if (records.get(i).startsWith(del_id1))
                        records.remove(i);
                }

                adapter.notifyDataSetChanged();
                countRecords_period();

                Toast.makeText(daftarobat.this, "Data berhasil dihapus", Toast.LENGTH_SHORT).show();
            }
        });

        //KALAU TIDAK YAKIN JANGAN DIHAPUS
        alertDialogHapus.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alertDialogHapus.show();






    }

    // TAMPILKAN JUMLAH DATA YANG ADA DALAM TABEL
    public void countRecords_period() {
        SQLiteDatabase database=dbhelper.getWritableDatabase();

        String sql = "SELECT * FROM tabel_period1";
        int recordCount = database.rawQuery(sql, null).getCount();
        database.close();

        TextView textViewRecordCount = (TextView) findViewById(R.id.txt_data_pasien);
        textViewRecordCount.setText("DATA PASIEN (" + recordCount + " data)");
    }

    // EDIT DATA DARI TABEL
    public void editRow(View view){
        Button bt_edit = (Button)view;
        SQLiteDatabase database = dbhelper.getWritableDatabase();
        final String del_id = bt_edit.getTag().toString();
        String sql_ambil_1_data = "SELECT * FROM tabel_period1 WHERE _id = " + del_id;
        final Cursor cursor = database.rawQuery(sql_ambil_1_data, null);
        final Context context = view.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View formElementsView = inflater.inflate(R.layout.periode_editdata, null, false);

        final EditText enterid1 = (EditText) formElementsView.findViewById(R.id.masukkanid);
        final EditText enternotes1 = (EditText) formElementsView.findViewById(R.id.masukkannotes);
        final EditText entermedicine1 = (EditText) formElementsView.findViewById(R.id.masukkanmedicine);
        final EditText entermoods1 = (EditText) formElementsView.findViewById(R.id.masukkanmoods);

        if (cursor.moveToFirst()) {

            int id_per = Integer.parseInt(cursor.getString(cursor.getColumnIndex(SQLiteDB.KEY_ID)));
            String notes_per = cursor.getString(cursor.getColumnIndex(SQLiteDB.KEY_NOTES));
            String medicine_per = cursor.getString(cursor.getColumnIndex(SQLiteDB.KEY_MEDICINE));
            String mood_per = cursor.getString(cursor.getColumnIndex(SQLiteDB.KEY_MOODS));

        }

        enterid1.setText(del_id);
        enternotes1.setText(cursor.getString(cursor.getColumnIndex(SQLiteDB.KEY_NOTES)));
        entermedicine1.setText(cursor.getString(cursor.getColumnIndex(SQLiteDB.KEY_MEDICINE)));
        entermoods1.setText(cursor.getString(cursor.getColumnIndex(SQLiteDB.KEY_MOODS)));

        cursor.close();
        database.close();



        new AlertDialog.Builder(context)
                .setView(formElementsView)
                .setTitle("Edit Record")
                .setPositiveButton("Save Changes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                String notesperiod2 = enternotes1.getText().toString();
                                String medicineperiod2 = entermedicine1.getText().toString();
                                String moodsperiod2 = entermoods1.getText().toString();
                                String idperiod2 = enterid1.getText().toString();

                                ContentValues values = new ContentValues();

                                values.put("notes", notesperiod2);
                                values.put("medicine", medicineperiod2);
                                values.put("moods", moodsperiod2);

                                String where = "_id = ?";

                                String[] whereArgs = { idperiod2 };

                                SQLiteDatabase database_period = dbhelper.getWritableDatabase();

                                boolean updateSuccessful = database_period.update("tabel_period1", values, where, whereArgs) > 0;

                                dialog.cancel();
                                adapter.clear();
                                readSampleData();
                            }

                        }).show();


        adapter.notifyDataSetChanged();
        countRecords_period();

    }

    // TAMBAH DATA KE TABEL
    public void tambahRow(View view){

        final Context context = view.getContext();

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View formElementsView = inflater.inflate(R.layout.periode_tambahdata, null, false);

        final EditText enternotes = (EditText) formElementsView.findViewById(R.id.masukkannotes);
        final EditText entermedicine = (EditText) formElementsView.findViewById(R.id.masukkanmedicine);
        final EditText entermoods = (EditText) formElementsView.findViewById(R.id.masukkanmoods);

        Button bt_tambah = (Button)view;
        SQLiteDatabase database = dbhelper.getWritableDatabase();

        new android.support.v7.app.AlertDialog.Builder(context)
                .setView(formElementsView)
                .setTitle("Tambah data period")
                .setPositiveButton("Simpan",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                String notesperiod = enternotes.getText().toString();
                                String medicineperiod = entermedicine.getText().toString();
                                String moodsperiod = entermoods.getText().toString();


                                ContentValues values = new ContentValues();

                                values.put("notes", notesperiod);
                                values.put("medicine", medicineperiod);
                                values.put("moods", moodsperiod);


                                SQLiteDatabase database_period = dbhelper.getWritableDatabase();

                                boolean createSuccessful = database_period.insert("tabel_period1", null, values) > 0;
                                database_period.close();


                                if (createSuccessful) {
                                    Toast.makeText(context, "Data period baru BERHASIH DISIMPAN", Toast.LENGTH_SHORT).show();
                                    // listview.setSelection(adapter.getCount()-1);
                                } else {
                                    Toast.makeText(context, "Data period baru GAGAL BERHASIH DISIMPAN", Toast.LENGTH_SHORT).show();
                                }


                                dialog.cancel();
                                adapter.clear();
                                readSampleData();
                                countRecords_period();
                                //ATUR LISTVIEW KE AKHIR
                                listview.setSelection(adapter.getCount()-1);

                            }

                        }).show();



        adapter.notifyDataSetChanged();
        countRecords_period();




    }


}
