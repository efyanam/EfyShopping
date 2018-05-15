package com.example.anas.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;


public class Main6CoklatMonggo extends AppCompatActivity {
    private TextView tvLinkfy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6_coklat_monggo);
        tvLinkfy = (TextView) findViewById(R.id.textViewLinkcoklatmonggo);
        tvLinkfy.setText("Coklat Monggo \n" +
                "Lihat Peta  \n" +
                "https://goo.gl/maps/KFGPPwPTsiz \n");
        Linkify.addLinks(tvLinkfy,Linkify.ALL);
    }
}
