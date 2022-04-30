package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Perfume extends AppCompatActivity {

    Button btnperfumes;
    Button butper;
    Button btc;
    Button bnc;
    Button bpc;
    Button byc;
    Button bhc;
    Button bfc;
    Button buc;
    Button bqc;
    Button brc;
    Button boc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfume);

btnperfumes=(Button)findViewById(R.id.per_d);
btnperfumes.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(Perfume.this,payment.class);
startActivity(intent);
    }
});

butper=(Button) findViewById(R.id.per_b);
butper.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(Perfume.this,payment.class);
        startActivity(intent);
    }
});

btc=(Button) findViewById(R.id.per_h);
btc.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(Perfume.this,payment.class);
        startActivity(intent);
    }
});
bnc=(Button) findViewById(R.id.per_g);
bnc.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(Perfume.this,payment.class);
        startActivity(intent);
    }
});
bpc=(Button) findViewById(R.id.per_c);
        bpc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Perfume.this,payment.class);
                startActivity(intent);
            }
        });

byc=(Button) findViewById(R.id.per_a);
        byc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Perfume.this,payment.class);
                startActivity(intent);
            }
        });
        bhc=(Button) findViewById(R.id.per_i);
        bhc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Perfume.this,payment.class);
                startActivity(intent);
            }
        });
bfc=(Button) findViewById(R.id.per_i);
        bfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Perfume.this,payment.class);
                startActivity(intent);
            }
        });
        buc=(Button) findViewById(R.id.per_y);
        buc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Perfume.this,payment.class);
                startActivity(intent);
            }
        });


    }
}