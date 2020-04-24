package com.example.remapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
private EditText Name;
private  EditText Password;
private Button LogIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Name=(EditText)findViewById(R.id.etName);
        Password=(EditText)findViewById(R.id.edtPassword);
        LogIn=(Button)findViewById(R.id.btnlogin);
    }
        private  void validate(String username,String password)
        {
            if( (username=="fjolla")&&(password=="1234"))
            {
                Intent Inten=new Intent(MainActivity.this,SecondActivity.class);
        }
        }



}
