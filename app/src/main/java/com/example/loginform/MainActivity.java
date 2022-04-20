package com.example.loginform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Email, password;
    Button Login;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Email = findViewById(R.id.edit9);
        password = findViewById(R.id.edit);
        Login = findViewById(R.id.btn_login2);
        DB = new DBHelper(this);

       Login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               String user = Email.getText().toString();
               String pass = password.getText().toString();
               if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass))
                   Toast.makeText(MainActivity.this, "All fields are Required", Toast.LENGTH_SHORT).show();
               else {
                   if (pass.equals(pass)) {
                       Boolean checkuser = DB.checkEmail(user);
                       if (checkuser == false) {
                           Boolean insert = DB.insertData(user, pass);
                           if (insert == true) {
                               Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                               Intent intent = new Intent(getApplicationContext(), bottomnavigation.class);
                               startActivity(intent);
                           } else {
                               Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                           }
                       } else {
                           Toast.makeText(MainActivity.this, "User already Exists", Toast.LENGTH_SHORT).show();
                           Intent intent = new Intent(getApplicationContext(), bottomnavigation.class);
                           startActivity(intent);
                       }
                   } else {
                       Toast.makeText(MainActivity.this, "Wrong Password", Toast.LENGTH_SHORT).show();
                   }

               }


           }




       });

    }
}