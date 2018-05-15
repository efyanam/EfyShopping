package com.example.anas.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class Main3Activity extends AppCompatActivity {
    //membuat variabel
    Button Sleman;
    Button Bantul;
    Button Yogyakarta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //isian method
        setContentView(R.layout.activity_main3);
        Sleman=(Button) findViewById(R.id.buttonsleman);
        Sleman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent intent = new Intent(Main3Activity.this, Main4Activity.class);//membuat class intent
                startActivity(intent);//membuka halaman baru

            }
                                  });

                Bantul=(Button) findViewById(R.id.buttonBantul);//masukkan button berdasarkan id
                Bantul.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent1 = new Intent(Main3Activity.this, Main5Wisatabantul.class);
                        startActivity(intent1);
                    }
                });
               Yogyakarta=(Button) findViewById(R.id.buttonyogya);
               Yogyakarta.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       Intent intent2 = new Intent(Main3Activity.this,Main6WisataYogya.class);
                       startActivity(intent2);







            }
        });
    }
}
