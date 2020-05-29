package com.rahul.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class meditate_two extends AppCompatActivity {
    Button song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditate_two);
        song = (Button) findViewById(R.id.button2);
        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(meditate_two.this, meditate_three.class);
                startActivity(in);
            }
        });
    }
}
