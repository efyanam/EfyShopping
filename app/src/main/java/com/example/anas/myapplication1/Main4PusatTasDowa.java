package com.example.anas.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.text.util.Linkify;
import android.widget.TextView;



public class Main4PusatTasDowa extends AppCompatActivity {
    private TextView tvLinkfy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4_pusat_tas_dowa);
        tvLinkfy = (TextView) findViewById(R.id.textViewLink3);
        tvLinkfy.setText("Pusat Tas Dowa \n" +
                "Lihat Peta  \n" +
                " https://goo.gl/maps/mUJg1DgmRzj \n");
        Linkify.addLinks(tvLinkfy,Linkify.ALL);
    }
}
