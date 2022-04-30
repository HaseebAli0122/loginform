package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

public class Medical_treatment extends AppCompatActivity {

    Button tr;
    Button tr_z;
    Button tr_x;
    Button tr_c;
    Button tr_v;
    Button tr_b;
    Button tr_n;
    Button tr_m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_treatment);

        tr=(Button) findViewById(R.id.tr);
        tr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Medical_treatment.this,payment.class);
                startActivity(intent);
            }
        });
        tr_z=(Button) findViewById(R.id.tr_p);
        tr_z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Medical_treatment.this,payment.class);
                startActivity(intent);
            }
        });
        tr_x=(Button) findViewById(R.id.tr_o);
        tr_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Medical_treatment.this,payment.class);
                startActivity(intent);
            }
        });
        tr_c=(Button) findViewById(R.id.tr_i);
        tr_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Medical_treatment.this,payment.class);
                startActivity(intent);
            }
        });
        tr_v=(Button) findViewById(R.id.tr_u);
        tr_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Medical_treatment.this,payment.class);
                startActivity(intent);
            }
        });
        tr_b=(Button) findViewById(R.id.tr_y);
        tr_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Medical_treatment.this,payment.class);
                startActivity(intent);
            }
        });

        tr_n=(Button) findViewById(R.id.tr_ah);
        tr_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Medical_treatment.this,payment.class);
                startActivity(intent);
            }
        });

        tr_m=(Button) findViewById(R.id.hj);
        tr_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Medical_treatment.this,payment.class);
                startActivity(intent);
            }
        });

    }
}