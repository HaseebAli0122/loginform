package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

public class Baby_product extends AppCompatActivity {

    Button bby_m;
    Button bby_k;
    Button bby_l;
    Button bby_r;
    Button bby_t;
    Button bby_i;
    Button bby_u;
    Button bby_p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby_product);
        bby_m=(Button) findViewById(R.id.bab_a);
        bby_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Baby_product.this,payment.class);
                startActivity(intent);
            }
        });

        bby_k=(Button) findViewById(R.id.bab_b);
        bby_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Baby_product.this,payment.class);
                startActivity(intent);
            }
        });
        bby_l=(Button) findViewById(R.id.bab_c);
        bby_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Baby_product.this,payment.class);
                startActivity(intent);
            }
        });
        bby_r=(Button) findViewById(R.id.bab_d);
        bby_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Baby_product.this,payment.class);
                startActivity(intent);
            }
        });
        bby_t=(Button) findViewById(R.id.bab_e);
        bby_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Baby_product.this,payment.class);
                startActivity(intent);
            }
        });
        bby_i=(Button) findViewById(R.id.bab_f);
        bby_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Baby_product.this,payment.class);
                startActivity(intent);
            }
        });
        bby_u=(Button) findViewById(R.id.bab_g);
        bby_u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Baby_product.this,payment.class);
                startActivity(intent);
            }
        });
bby_p=(Button) findViewById(R.id.bab_h);
        bby_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Baby_product.this,payment.class);
                startActivity(intent);
            }
        });


    }
}