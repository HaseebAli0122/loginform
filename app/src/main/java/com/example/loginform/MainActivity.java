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
    EditText username, password,repassword;
    Button signup,signin;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.edit9);
        password = (EditText) findViewById(R.id.password);
        repassword = (EditText) findViewById(R.id.repassword);
        signup = (Button) findViewById(R.id.btnsignup25);
        signin = (Button) findViewById(R.id.btnsignin25);
        DB = new DBHelper(this);

       signup.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               String user = username.getText().toString();
               String pass = password.getText().toString();
               String repass = repassword.getText().toString();
               if (user.equals("") || pass.equals("") || repass.equals(""))
                   Toast.makeText(MainActivity.this, "Please Enter All the fields ", Toast.LENGTH_SHORT).show();
               else {
                   if (pass.equals(repass)) {
                       Boolean checkuser = DB.checkusername(user);
                       if (checkuser == false) {
                           Boolean insert = DB.insertData(user, pass);
                           if (insert == true) {
                               Toast.makeText(MainActivity.this, "Regitered Successful", Toast.LENGTH_SHORT).show();
                               Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                               startActivity(intent);
                           } else {
                               Toast.makeText(MainActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                           }
                       } else {
                           Toast.makeText(MainActivity.this, "User already Exists Please Signin", Toast.LENGTH_SHORT).show();

                       }
                   } else {
                       Toast.makeText(MainActivity.this, "Wrong Password", Toast.LENGTH_SHORT).show();
                   }

               }


           }




       });
       signin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(getApplicationContext(),Registration.class);
               startActivity(intent);

           }
       });

    }
}