package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class beauty_product extends AppCompatActivity {

ImageButton bbp_s;
    ImageButton bbp_d;
    ImageButton bbp_f;
    ImageButton bbp_g;
    ImageButton bbp_h;
    ImageButton bbp_j;
    ImageButton bbp_k;
    ImageButton bbp_l;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty_product);

        bbp_s=(ImageButton) findViewById(R.id.bp_q);
        bbp_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(beauty_product.this,payment.class);
                startActivity(intent);
            }
        });

        bbp_d=(ImageButton) findViewById(R.id.bq_w);
        bbp_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(beauty_product.this,payment.class);
                startActivity(intent);
            }
        });
        bbp_f=(ImageButton) findViewById(R.id.bq_e);
        bbp_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(beauty_product.this,payment.class);
                startActivity(intent);
            }
        });
        bbp_g=(ImageButton) findViewById(R.id.bq_r);
        bbp_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(beauty_product.this,payment.class);
                startActivity(intent);
            }
        });
        bbp_h=(ImageButton) findViewById(R.id.bq_t);
        bbp_h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(beauty_product.this,payment.class);
                startActivity(intent);
            }
        });
        bbp_j=(ImageButton) findViewById(R.id.bq_y);
        bbp_j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(beauty_product.this,payment.class);
                startActivity(intent);
            }
        });
        bbp_k=(ImageButton) findViewById(R.id.bq_u);
        bbp_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(beauty_product.this,payment.class);
                startActivity(intent);
            }
        });
        bbp_l=(ImageButton) findViewById(R.id.bq_i);
        bbp_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(beauty_product.this,payment.class);
                startActivity(intent);
            }
        });


    }
}