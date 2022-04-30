package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

public class beauty_product extends AppCompatActivity {

    Button bbp_s;
    Button bbp_d;
    Button bbp_f;
    Button bbp_g;
    Button bbp_h;
    Button bbp_j;
    Button bbp_k;
    Button bbp_l;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty_product);

        bbp_s=(Button) findViewById(R.id.bp_q);
        bbp_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(beauty_product.this,payment.class);
                startActivity(intent);
            }
        });

        bbp_d=(Button) findViewById(R.id.bq_w);
        bbp_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(beauty_product.this,payment.class);
                startActivity(intent);
            }
        });
        bbp_f=(Button) findViewById(R.id.bq_e);
        bbp_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(beauty_product.this,payment.class);
                startActivity(intent);
            }
        });
        bbp_g=(Button) findViewById(R.id.bq_r);
        bbp_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(beauty_product.this,payment.class);
                startActivity(intent);
            }
        });
        bbp_h=(Button) findViewById(R.id.bq_t);
        bbp_h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(beauty_product.this,payment.class);
                startActivity(intent);
            }
        });
        bbp_j=(Button) findViewById(R.id.bq_y);
        bbp_j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(beauty_product.this,payment.class);
                startActivity(intent);
            }
        });
        bbp_k=(Button) findViewById(R.id.bq_u);
        bbp_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(beauty_product.this,payment.class);
                startActivity(intent);
            }
        });
        bbp_l=(Button) findViewById(R.id.bq_i);
        bbp_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(beauty_product.this,payment.class);
                startActivity(intent);
            }
        });


    }
}