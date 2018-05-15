package com.example.anas.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class Main4SundayMorningUGM extends AppCompatActivity {
private  TextView tvLinkfy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4_sunday_morning_ugm);
        tvLinkfy = (TextView) findViewById(R.id.textViewLink6);
        tvLinkfy.setText("SundayMorningUGM\n" +
                "Lihat Peta  \n" +
                "https://goo.gl/maps/EoBewoBeV1y \n");
        Linkify.addLinks(tvLinkfy,Linkify.ALL);
    }
}
