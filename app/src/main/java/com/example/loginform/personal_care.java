package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class personal_care extends AppCompatActivity {

    Button pa;
    Button pb;
    Button pc;
    Button pd;
    Button pe;
    Button pf;
    Button pg;
    Button ph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_care);
        pa=(Button) findViewById(R.id.pc_c);
        pa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(personal_care.this,payment.class);
                startActivity(intent);
            }
        });
        pb=(Button) findViewById(R.id.pc_v);
        pb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(personal_care.this,payment.class);
                startActivity(intent);
            }
        });
        pc=(Button) findViewById(R.id.pc_b);
        pc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(personal_care.this,payment.class);
                startActivity(intent);
            }
        });
        pd=(Button) findViewById(R.id.pc_n);
        pd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(personal_care.this,payment.class);
                startActivity(intent);
            }
        });
        pe=(Button) findViewById(R.id.pc_m);
        pe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(personal_care.this,payment.class);
                startActivity(intent);
            }
        });
        pf=(Button) findViewById(R.id.pc_a);
        pf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(personal_care.this,payment.class);
                startActivity(intent);
            }
        });
        pg=(Button) findViewById(R.id.pc_s);
        pg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(personal_care.this,payment.class);
                startActivity(intent);
            }
        });
        ph=(Button) findViewById(R.id.pc_d);
        ph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(personal_care.this,payment.class);
                startActivity(intent);
            }
        });

    }
}