package com.example.lostandfound;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity implements View.OnClickListener {
ImageButton imageButton7,imageButton2,imageButton3;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
        imageButton7.setOnClickListener(this);
        imageButton3 = (ImageButton) findViewById(R.id.home1);
        imageButton3.setOnClickListener(this);
        imageButton2 = (ImageButton) findViewById(R.id.report1);
        imageButton2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(R.id.imageButton7 == v.getId()) {
            Intent intent = new Intent(this, Lostandfound.class);
            startActivity(intent);
        }else if(R.id.home1 == v.getId()) {
                Intent i = new Intent(this, Main.class);
                startActivity(i);
        }else if(R.id.report1 == v.getId()){
                Intent a = new Intent (this, lostfoundreport.class);
                startActivity(a);
        }
    }
}