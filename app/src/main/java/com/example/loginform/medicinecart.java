package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class medicinecart extends AppCompatActivity {
    List<Model>modelList;
    RecyclerView recyclerView;
    OrderAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicinecart);
        // creating an arraylist

         modelList = new ArrayList<>();
        modelList.add(new Model("Desprine", getString(R.string.Disprine), R.drawable.disp ));
        modelList.add(new Model("Panadol", getString(R.string.Panadol), R.drawable.panadol));
        modelList.add(new Model("Brufen", getString(R.string.Brufin), R.drawable.bru));
        modelList.add(new Model("Polyfax", getString(R.string.Polyfax), R.drawable.polyfax));
        modelList.add(new Model("Pyodine", getString(R.string.Pyodine), R.drawable.dine));
        modelList.add(new Model("No Kuff", getString(R.string.NoKuff), R.drawable.nokuff));
        modelList.add(new Model("Mucaine", getString(R.string.Mucaine), R.drawable.muc));
        modelList.add(new Model("Nilstat", getString(R.string.Nilstat), R.drawable.nil));
        modelList.add(new Model("Humuline", getString(R.string.Humuline), R.drawable.hum));

        // recyclerview
        recyclerView = findViewById(R.id.recyclerView);
       recyclerView.setLayoutManager(new LinearLayoutManager(null));
        // adapter
        mAdapter = new OrderAdapter(this, modelList);
        recyclerView.setAdapter(mAdapter);



    }
}