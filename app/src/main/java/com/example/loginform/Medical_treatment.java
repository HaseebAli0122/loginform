package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Medical_treatment extends AppCompatActivity {

    ImageButton tr;
    ImageButton tr_z;
    ImageButton tr_x;
    ImageButton tr_c;
    ImageButton tr_v;
    ImageButton tr_b;
    ImageButton tr_n;
    ImageButton tr_m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_treatment);

        tr=(ImageButton) findViewById(R.id.tr);
        tr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Medical_treatment.this,payment.class);
                startActivity(intent);
            }
        });
        tr_z=(ImageButton) findViewById(R.id.tr_p);
        tr_z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Medical_treatment.this,payment.class);
                startActivity(intent);
            }
        });
        tr_x=(ImageButton) findViewById(R.id.tr_o);
        tr_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Medical_treatment.this,payment.class);
                startActivity(intent);
            }
        });
        tr_c=(ImageButton) findViewById(R.id.tr_i);
        tr_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Medical_treatment.this,payment.class);
                startActivity(intent);
            }
        });
        tr_v=(ImageButton) findViewById(R.id.tr_u);
        tr_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Medical_treatment.this,payment.class);
                startActivity(intent);
            }
        });
        tr_b=(ImageButton) findViewById(R.id.tr_y);
        tr_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Medical_treatment.this,payment.class);
                startActivity(intent);
            }
        });

        tr_n=(ImageButton) findViewById(R.id.tr_ah);
        tr_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Medical_treatment.this,payment.class);
                startActivity(intent);
            }
        });

        tr_m=(ImageButton) findViewById(R.id.hj);
        tr_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Medical_treatment.this,payment.class);
                startActivity(intent);
            }
        });

    }
}