package com.example.anas.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;



public class Main6KerajinanPerakKotaGede extends AppCompatActivity {
    private TextView tvLinkfy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6_kerajinan_perak_kota_gede);
        tvLinkfy = (TextView) findViewById(R.id.textViewLinkperakkkotagede);
        tvLinkfy.setText("Kerajinan Perak KotaGede \n" +
                "Lihat Peta  \n" +
                "https://goo.gl/maps/ZtpVJp1N34T2  \n");
        Linkify.addLinks(tvLinkfy,Linkify.ALL);
    }
}
