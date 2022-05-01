package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pediasure extends AppCompatActivity {

    Button pdx;
    Button pdy;
    Button pdz;
    Button pda;
    Button pdb;
    Button pdc;
    Button pdd;
    Button pde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pediasure);

        pdx=(Button) findViewById(R.id.ps_d);
        pdx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(pediasure.this,payment.class);
                startActivity(intent);
            }
        });

        pdy=(Button) findViewById(R.id.ps_f);
        pdy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(pediasure.this,payment.class);
                startActivity(intent);
            }
        });
        pdz=(Button) findViewById(R.id.ps_g);
        pdz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(pediasure.this,payment.class);
                startActivity(intent);
            }
        });
        pda=(Button) findViewById(R.id.ps_h);
        pda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(pediasure.this,payment.class);
                startActivity(intent);
            }
        });
        pdb=(Button) findViewById(R.id.ps_j);
        pdb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(pediasure.this,payment.class);
                startActivity(intent);
            }
        });
        pdc=(Button) findViewById(R.id.ps_k);
        pdc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(pediasure.this,payment.class);
                startActivity(intent);
            }
        });
        pdd=(Button) findViewById(R.id.ps_l);
        pdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(pediasure.this,payment.class);
                startActivity(intent);
            }
        });
        pde=(Button) findViewById(R.id.ps_p);
        pde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(pediasure.this,payment.class);
                startActivity(intent);
            }
        });


    }

}