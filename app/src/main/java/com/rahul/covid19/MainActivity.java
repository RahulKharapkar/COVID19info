package com.rahul.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button asses, prevent, medit, coTrack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 asses = (Button) findViewById(R.id.assesment);
 prevent =(Button) findViewById(R.id.prevention);
        medit = (Button) findViewById(R.id.meditate);
        coTrack = (Button) findViewById(R.id.corona_tracker);

        coTrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, Corona_Tracker.class);
                startActivity(in);

            }
        });
        asses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(MainActivity.this, check_symptoms.class);
                startActivity(in);
            }
        });

        prevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(MainActivity.this, preventionScreen.class);
                startActivity(in);
            }
        });
        medit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(MainActivity.this, meditate.class);
                startActivity(in);
            }
        });
    }
}
