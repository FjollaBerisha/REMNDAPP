package com.example.remapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
         Button button=(Button)findViewById(R.id.btnListat);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 OpenFourthActivity();
             }
         });
        Button btn=(Button)findViewById(R.id.btnTodo);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenThirdActivity();
            }
        });

    }
    public  void  OpenThirdActivity()
    {
        Intent intent=new Intent(this,ThirdActivity.class);

        startActivity(intent);
    }
    public  void OpenFourthActivity()
    {
        Intent intent=new Intent(this,FourthActivity.class)
                startActivity(intent);
    }

}
