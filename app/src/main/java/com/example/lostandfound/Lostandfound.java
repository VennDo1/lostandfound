package com.example.lostandfound;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Lostandfound extends AppCompatActivity {
    ImageButton imageButton8,imageButton12;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lostandfound);


        imageButton12 = (ImageButton) findViewById(R.id.imageButton12);
        imageButton8 = (ImageButton) findViewById(R.id.imageButton8);

        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == imageButton8) {
                    Intent intent = new Intent(Lostandfound.this, Lostfound.class);
                    startActivity(intent);
                } else {
                    throw new IllegalStateException("Unexpected view clicked: " + v.getId());
                }
            }

        });

        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == imageButton12) {
                    Intent intent = new Intent(Lostandfound.this, Main.class);
                    startActivity(intent);
                } else {
                    throw new IllegalStateException("Unexpected view clicked: " + v.getId());
                }
            }

        });
    }
}
