package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.Button;


public class medicinecart extends AppCompatActivity {

Button mc;
Button mc_c;
Button mc_v;
Button mc_b;
Button mc_n;
Button mc_m;
Button mc_l;
Button mc_k;
Button mc_j;
Button mc_h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicinecart);
    mc=(Button) findViewById(R.id.md_d);
    mc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(medicinecart.this,payment.class);
            startActivity(intent);
        }
    });
    mc_c=(Button) findViewById(R.id.md_p);
    mc_c.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(medicinecart.this,payment.class);
            startActivity(intent);
        }
    });
mc_v=(Button) findViewById(R.id.md_b);
mc_v.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(medicinecart.this,payment.class);
        startActivity(intent);
    }
});
mc_b=(Button) findViewById(R.id.md_f);
mc_b.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(medicinecart.this,payment.class);
        startActivity(intent);
    }
});
mc_n=(Button) findViewById(R.id.md_y);
mc_n.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(medicinecart.this,payment.class);
        startActivity(intent);
    }
});
mc_m=(Button) findViewById(R.id.md_n);
mc_m.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(medicinecart.this,payment.class);
        startActivity(intent);
    }
});
mc_l=(Button) findViewById(R.id.md_u);
mc_l.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(medicinecart.this,payment.class);
        startActivity(intent);
    }
});
mc_k=(Button) findViewById(R.id.md_l);
mc_k.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(medicinecart.this,payment.class);
        startActivity(intent);
    }
});
mc_j=(Button) findViewById(R.id.md_hu);
mc_j.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(medicinecart.this,payment.class);
        startActivity(intent);
    }
});
mc_h=(Button) findViewById(R.id.md_r);
mc_h.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(medicinecart.this,payment.class);
        startActivity(intent);
    }
});

    }
}