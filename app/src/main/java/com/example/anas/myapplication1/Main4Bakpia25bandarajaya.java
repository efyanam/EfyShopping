package com.example.anas.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import android.text.util.Linkify;


public class Main4Bakpia25bandarajaya extends AppCompatActivity {

    private TextView tvLinkfy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4_bakpia25bandarajaya);
        tvLinkfy = (TextView) findViewById(R.id.textViewLink1);
        tvLinkfy.setText("Bakpia Bandara \n" +
                "Lihat Peta  \n" +
                "https://goo.gl/maps/zYts6VhW1gG2 \n");//membuat hyperlink
        Linkify.addLinks(tvLinkfy,Linkify.ALL);//memilih semua link yang ditampilkan
    }
}
