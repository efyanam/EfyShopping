package com.example.anas.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;



public class Main4PasarGodean extends AppCompatActivity {
    private TextView tvLinkfy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4_pasar_godean);
        tvLinkfy = (TextView) findViewById(R.id.textViewLink);
        tvLinkfy.setText("Pasar Godean \n" +
           "Lihat Peta  \n" +
                "https://goo.gl/maps/Ed8FsFgKcj82 \n");
        Linkify.addLinks(tvLinkfy,Linkify.ALL);
    }
}
