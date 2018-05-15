package com.example.anas.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;




public class Main5wisatabantulpasarsenigabusan extends AppCompatActivity {
    private TextView tvLinkfy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5wisatabantulpasarsenigabusan);
        tvLinkfy = (TextView) findViewById(R.id.textViewLinksenigabusan);
        tvLinkfy.setText("Pasar Seni Gabusan \n" +
                "Lihat Peta  \n" +
                "https://goo.gl/maps/LkpapZq6SiN2 \n");
        Linkify.addLinks(tvLinkfy,Linkify.ALL);

    }
}
