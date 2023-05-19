package com.example.lostandfound;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class lostfoundreport extends AppCompatActivity {
    ImageButton report1;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lostfoundreport);


        report1 = (ImageButton) findViewById(R.id.report1);
//            imageButton8 = (ImageButton) findViewById(R.id.imageButton8);

//            report1.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if (v == imageButton8) {
//                        Intent intent = new Intent(lostfoundreport.this, Lostfound.class);
//                        startActivity(intent);
//                    } else {
//                        throw new IllegalStateException("Unexpected view clicked: " + v.getId());
//                    }
//                }
//
//            });

    }
}
