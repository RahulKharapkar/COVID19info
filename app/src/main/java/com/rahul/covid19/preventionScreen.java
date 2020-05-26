package com.rahul.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class preventionScreen extends AppCompatActivity {
Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention_screen);
        next =(Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(preventionScreen.this, preventionScreenTwo.class);
                startActivity(in);
            }
        });
    }
}
