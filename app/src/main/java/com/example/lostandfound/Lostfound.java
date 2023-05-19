package com.example.lostandfound;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Lostfound extends AppCompatActivity {
    ImageButton imageButton3;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lostfoundreport);

//        imageButton3 = (ImageButton) findViewById(R.id.home1);

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == imageButton3) {
                    Intent intent = new Intent(Lostfound.this, Main.class);
                    startActivity(intent);
                } else {
                    throw new IllegalStateException("Unexpected view clicked: " + v.getId());
                }
            }
        });
    }

}
