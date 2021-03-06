package com.example.loginform;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {
    CheckBox showcheck_btn;
    EditText username,password;
    Button btnsignin;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        getSupportActionBar().hide();
       username =(EditText) findViewById(R.id.username1);
       password = (EditText) findViewById(R.id.password1);
       btnsignin = (Button) findViewById(R.id.btnsignin26);
       showcheck_btn = findViewById(R.id.checkboxbtn);
       DB = new DBHelper(this);
       showcheck_btn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton ButtonView, boolean isChecked) {
               if(isChecked){
                   password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
               }else{
                   password.setTransformationMethod(PasswordTransformationMethod.getInstance());
               }
           }
       });
       btnsignin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String user = username.getText().toString();
               String pass = password.getText().toString();
               if(user.equals(" ")|| pass.equals(""))
                   Toast.makeText(Registration.this, "Please Enter All the fields", Toast.LENGTH_SHORT).show();
               else{
                   Boolean checkuserpass = DB.checkusernamepassword(user,pass);
                   if(checkuserpass==true){
                       Toast.makeText(Registration.this, "Sign in Successfully", Toast.LENGTH_SHORT).show();
                       Intent intent = new Intent(getApplicationContext(),bottomnavigation.class);
                       startActivity(intent);
                   }else{
                       Toast.makeText(Registration.this, "Invalid Crendentials", Toast.LENGTH_SHORT).show();
                   }
               }
           }
       });
    }
}