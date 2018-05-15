package com.example.anas.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class Main6Malioboro extends AppCompatActivity {
    private TextView tvLinkfy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6_malioboro);
        tvLinkfy = (TextView) findViewById(R.id.textViewLinkmalioboro);
        tvLinkfy.setText("Malioboro \n" +
                "Lihat Peta  \n" +
                "https://goo.gl/maps/oy1SSPuZa6w \n");
        Linkify.addLinks(tvLinkfy,Linkify.ALL);
    }
}
