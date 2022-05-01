package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gloves extends AppCompatActivity {
    Button g;
    Button g1;
    Button g2;
    Button g3;
    Button g4;
    Button g5;
    Button g6;
    Button g7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gloves);
        g=(Button) findViewById(R.id.g_f);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(gloves.this,payment.class);
                startActivity(intent);
            }
        });
        g1=(Button) findViewById(R.id.g_g);
        g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(gloves.this,payment.class);
                startActivity(intent);
            }
        });
        g2=(Button) findViewById(R.id.g_h);
        g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(gloves.this,payment.class);
                startActivity(intent);
            }
        });
        g3=(Button) findViewById(R.id.g_j);
        g3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(gloves.this,payment.class);
                startActivity(intent);
            }
        });
        g4=(Button) findViewById(R.id.g_k);
        g4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(gloves.this,payment.class);
                startActivity(intent);
            }
        });
        g5=(Button) findViewById(R.id.g_l);
        g5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(gloves.this,payment.class);
                startActivity(intent);
            }
        });

    }
}