package com.example.anas.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;


public class Main4RaihanOlehOlehHaji extends AppCompatActivity {
private  TextView tvLinkfy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4_raihan_oleh_oleh_haji);
        tvLinkfy = (TextView) findViewById(R.id.textViewLink4);
        tvLinkfy.setText("RaihanOlehOlehHaji \n" +
                "Lihat Peta  \n" +
                "https://goo.gl/maps/NxmpvtFVrNP2 \n");
        Linkify.addLinks(tvLinkfy,Linkify.ALL);
    }
}
