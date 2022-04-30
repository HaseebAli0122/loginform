package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Perfume extends AppCompatActivity {

    ImageButton btnperfumes;
    ImageButton butper;
    ImageButton btc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfume);

btnperfumes=(ImageButton)findViewById(R.id.per_d);
btnperfumes.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(Perfume.this,payment.class);
startActivity(intent);
    }
});

butper=(ImageButton) findViewById(R.id.per_b);
butper.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(Perfume.this,payment.class);
        startActivity(intent);
    }
});

btc=(ImageButton) findViewById(R.id.per_h);
btc.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(Perfume.this,payment.class);
        startActivity(intent);
    }
});

    }
}