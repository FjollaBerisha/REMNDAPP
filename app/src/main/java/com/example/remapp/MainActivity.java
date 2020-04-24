package com.example.remapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
private EditText Name;
private  EditText Password;
private Button LogIn;
private TextView Attempts;
private  int Counter=3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Name=(EditText)findViewById(R.id.etName);
        Password=(EditText)findViewById(R.id.edtPassword);
        LogIn=(Button)findViewById(R.id.btnlogin);
        Attempts=(TextView)findViewById(R.id.text1);

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(),Password.getText().toString());

            }
        });
    }
        private  void validate(String username,String password)
        {
            if((username.equals("fjolla"))&&(password.equals("1234")))
            {
                Intent Inten=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(Inten);
             }
            else
            {
                Counter--;
                Attempts.setText("0 Attempts remaining"+String.valueOf(Counter));

                if(Counter==0)
                {
                    LogIn.setEnabled(false);
                }
            }


        }

    }


