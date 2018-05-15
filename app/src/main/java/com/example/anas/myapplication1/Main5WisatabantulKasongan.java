package com.example.anas.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.text.util.Linkify;
import android.widget.TextView;


public class Main5WisatabantulKasongan extends AppCompatActivity {
    private TextView tvLinkfy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5_wisatabantul_kasongan);
        tvLinkfy = (TextView) findViewById(R.id.textViewLinkkasongan);
        tvLinkfy.setText("Wisata bantul Kasongan \n" +
                "Lihat Peta  \n" +
                "https://goo.gl/maps/Ed8FsFgKcj82 \n");
        Linkify.addLinks(tvLinkfy,Linkify.ALL);
    }
}
