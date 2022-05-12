package com.example.loginform;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class splashs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashs);
        getSupportActionBar().hide();
        Thread back = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                    Intent i = new Intent(splashs.this, MainActivity.class);
                    startActivity(i);
                    finish();
                } catch (Exception e) {
                }

            }
        };
        back.start();
    }
}