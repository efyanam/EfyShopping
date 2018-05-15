package com.example.anas.myapplication1;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;





public class Main4Activity extends AppCompatActivity {
    Button PasarGodean;
    Button Bakpia25bandarajaya;
    Button PusatTasDowa;
    Button RaihanOlehOlehHaji;
    Button SundayMorningMarketUGM;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        PasarGodean = (Button) findViewById(R.id.buttonpasargodean);
        PasarGodean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main4Activity.this, Main4PasarGodean.class);
                startActivity(intent);
                Bakpia25bandarajaya = (Button) findViewById(R.id.buttonbakpia25bandarajaya);
                Bakpia25bandarajaya.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent1 = new Intent(Main4Activity.this, Main4Bakpia25bandarajaya.class);
                        startActivity(intent1);
                        PusatTasDowa = (Button) findViewById(R.id.buttonpusattasdowa);
                        PusatTasDowa.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent2 = new Intent(Main4Activity.this, Main4PusatTasDowa.class);
                                startActivity(intent2);
                                RaihanOlehOlehHaji = (Button) findViewById(R.id.buttonRaihanoleholehhaji);
                                RaihanOlehOlehHaji.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent intent3 = new Intent(Main4Activity.this, Main4RaihanOlehOlehHaji.class);
                                        startActivity(intent3);
                                        SundayMorningMarketUGM = (Button) findViewById(R.id.buttonsundaymorningUGM);
                                        SundayMorningMarketUGM.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent intent4 = new Intent(Main4Activity.this, Main4SundayMorningUGM.class);
                                                startActivity(intent4);

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