package com.example.anas.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;



public class Main5wisatabantulpasarklitikan extends AppCompatActivity {
    private TextView tvLinkfy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5wisatabantulpasarklitikan);
        tvLinkfy = (TextView) findViewById(R.id.textViewLinkpasarklitikan);
        tvLinkfy.setText("pasar klitikan \n" +
                "Lihat Peta  \n" +
                "https://goo.gl/maps/sS5UsNUxXX12 \n");
        Linkify.addLinks(tvLinkfy,Linkify.ALL);
    }
}
