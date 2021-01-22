package com.example.user.HealeApps.disease;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.HealeApps.R;

@SuppressWarnings("deprecation")
public class detailpenyakit extends Activity {
    ImageView Im;
    TextView tv_nama, tv_penyebab, tv_gejala, tv_description, tv_size,id, namaIm;
    Gallery gallery;
    ImageSwitcher imageSwitcher;

    Integer[] imageIDs = new Integer[3];
    int msg_im;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detaildisease);

        Intent iIdentifikasi = getIntent();
        msg_im = iIdentifikasi.getIntExtra("dataIM", 0);
        String msg_nama = iIdentifikasi.getStringExtra("dataNama");
        String msg_penyebab = iIdentifikasi.getStringExtra("dataPenyebab");
        String msg_gejala = iIdentifikasi.getStringExtra("dataGejala");
        String msg_description = iIdentifikasi.getStringExtra("dataDescription");


        Im = (ImageView) findViewById(R.id.iv_detail);

        tv_nama = (TextView) findViewById(R.id.tvNama);
        tv_penyebab = (TextView) findViewById(R.id.tvPenyebab);
        tv_description = (TextView) findViewById(R.id.tvDescription);
        tv_gejala = (TextView) findViewById(R.id.tvGejala);

        Im.setImageResource(msg_im);
        tv_nama.setText(msg_nama);
        tv_penyebab.setText(msg_penyebab);
        tv_gejala.setText(msg_gejala);
        tv_description.setText(msg_description);

    }
}