package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Baby_product extends AppCompatActivity {

    ImageButton bby_m;
    ImageButton bby_k;
    ImageButton bby_l;
    ImageButton bby_r;
    ImageButton bby_t;
    ImageButton bby_i;
    ImageButton bby_u;
    ImageButton bby_p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby_product);
        bby_m=(ImageButton) findViewById(R.id.bab_a);
        bby_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Baby_product.this,payment.class);
                startActivity(intent);
            }
        });

        bby_k=(ImageButton) findViewById(R.id.bab_b);
        bby_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Baby_product.this,payment.class);
                startActivity(intent);
            }
        });
        bby_l=(ImageButton) findViewById(R.id.bab_c);
        bby_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Baby_product.this,payment.class);
                startActivity(intent);
            }
        });
        bby_r=(ImageButton) findViewById(R.id.bab_d);
        bby_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Baby_product.this,payment.class);
                startActivity(intent);
            }
        });
        bby_t=(ImageButton) findViewById(R.id.bab_e);
        bby_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Baby_product.this,payment.class);
                startActivity(intent);
            }
        });
        bby_i=(ImageButton) findViewById(R.id.bab_f);
        bby_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Baby_product.this,payment.class);
                startActivity(intent);
            }
        });
        bby_u=(ImageButton) findViewById(R.id.bab_g);
        bby_u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Baby_product.this,payment.class);
                startActivity(intent);
            }
        });
bby_p=(ImageButton) findViewById(R.id.bab_h);
        bby_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Baby_product.this,payment.class);
                startActivity(intent);
            }
        });


    }
}