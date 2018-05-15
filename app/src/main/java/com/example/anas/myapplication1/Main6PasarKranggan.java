package com.example.anas.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;



public class Main6PasarKranggan extends AppCompatActivity {
    private TextView tvLinkfy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6_pasar_kranggan);
        tvLinkfy = (TextView) findViewById(R.id.textViewLinkpasarkranggan);
        tvLinkfy.setText("Pasar Kranggan \n" +
                "Lihat Peta  \n" +
                "https://goo.gl/maps/9ast5VCWDwC2 \n");
        Linkify.addLinks(tvLinkfy,Linkify.ALL);
    }
}
