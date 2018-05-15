package com.example.anas.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Main5Wisatabantul extends AppCompatActivity {
    Button WisataBelanjaKasongan;
    Button KerajinanKulitManding;
    Button PasarKlitikan;
    Button WisataBelanjaKrebet;
    Button PasarSeniGabusan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5_wisatabantul);
        PasarSeniGabusan=(Button) findViewById(R.id.buttonpasarsenigabusan);
        PasarSeniGabusan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(Main5Wisatabantul.this,Main5wisatabantulpasarsenigabusan.class);
                startActivity(intent5);
            }
        });
        WisataBelanjaKrebet=(Button) findViewById(R.id.buttonwisatakrebet);
        WisataBelanjaKrebet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(Main5Wisatabantul.this,Main5wisatabantulkrebet.class);
                startActivity(intent4);
            }
        });
        PasarKlitikan = (Button) findViewById(R.id.buttonpasarklitikan);
        PasarKlitikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Main5Wisatabantul.this,Main5wisatabantulpasarklitikan.class);
                startActivity(intent3);
            }
        });
        WisataBelanjaKasongan = (Button) findViewById(R.id.buttonpasarkasongan);
        WisataBelanjaKasongan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Main5Wisatabantul.this, Main5WisatabantulKasongan.class);
                startActivity(intent1);
                KerajinanKulitManding = (Button) findViewById(R.id.buttonpasarkulitmanding);
                KerajinanKulitManding.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent2 = new Intent(Main5Wisatabantul.this, Main5wisatabantulkulitmanding.class);
                        startActivity(intent2);
                    }


                });
            }

        });
    }
}