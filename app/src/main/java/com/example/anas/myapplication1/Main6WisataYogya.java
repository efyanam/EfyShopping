package com.example.anas.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main6WisataYogya extends AppCompatActivity {
    Button Malioboro;
    Button PasarBeringharjo;
    Button KerajinanPerakKotaGede;
    Button PasarSoreMalioboro;
    Button CoklatMonggo;
    Button PasarKranggan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6_wisata_yogya);
        Malioboro=(Button) findViewById(R.id.buttonMalioboro);
        Malioboro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main6WisataYogya.this,Main6Malioboro.class);
                startActivity(intent);
                PasarBeringharjo=(Button) findViewById(R.id.buttonpasarberingharjo);
                PasarBeringharjo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent1=new Intent(Main6WisataYogya.this,Main6PasarBeringharjo.class);
                        startActivity(intent1);
                        KerajinanPerakKotaGede=(Button) findViewById(R.id.buttonkerajinanperakkotagede);
                        KerajinanPerakKotaGede.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent2=new Intent(Main6WisataYogya.this,Main6KerajinanPerakKotaGede.class);
                                startActivity(intent2);
                                PasarSoreMalioboro=(Button) findViewById(R.id.buttonpasarsoremalioboro);
                                PasarSoreMalioboro.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent intent3=new Intent(Main6WisataYogya.this,Main6PasarSoreMalioboro.class);
                                        startActivity(intent3);
                                        CoklatMonggo=(Button) findViewById(R.id.buttoncoklatmonggo);
                                        CoklatMonggo.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent intent4=new Intent(Main6WisataYogya.this,Main6CoklatMonggo.class);
                                                startActivity(intent4);
                                                PasarKranggan=(Button) findViewById(R.id.buttonpasarkranggan);
                                                PasarKranggan.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        Intent intent5=new Intent(Main6WisataYogya.this,Main6PasarKranggan.class);
                                                        startActivity(intent5);
                                                    }
                                                });
                                            }
                                        });

                                    }
                                });
                            }
                        });

                    }
                });
            }
        });
    }
}
