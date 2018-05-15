package com.example.anas.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;



public class Main5wisatabantulkulitmanding extends AppCompatActivity {
    private TextView tvLinkfy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5wisatabantulkulitmanding);
        tvLinkfy = (TextView) findViewById(R.id.textViewLinkkulitmanding);
        tvLinkfy.setText("Wisata Kerajinan Kulitmanding \n" +
                "Lihat Peta  \n" +
                "https://goo.gl/maps/KZq4rHfJdVC2 \n");
        Linkify.addLinks(tvLinkfy,Linkify.ALL);
    }
}
