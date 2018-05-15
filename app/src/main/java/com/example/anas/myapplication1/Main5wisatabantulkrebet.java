package com.example.anas.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;


public class Main5wisatabantulkrebet extends AppCompatActivity {
    private TextView tvLinkfy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5wisatabantulkrebet);
        tvLinkfy = (TextView) findViewById(R.id.textViewLinkkrebet);
        tvLinkfy.setText("Wisata Belanja Krebet \n" +
                "Lihat Peta  \n" +
                "https://goo.gl/maps/gdYfixo3DF12 \n");
        Linkify.addLinks(tvLinkfy,Linkify.ALL);
    }
}
