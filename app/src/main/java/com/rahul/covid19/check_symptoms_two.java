package com.rahul.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class check_symptoms_two extends AppCompatActivity {
    Button yes_btn, no_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_symptoms_two);
        yes_btn = (Button) findViewById(R.id.s);
        no_btn = (Button) findViewById(R.id.n);

        yes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(check_symptoms_two.this, symptoms_s.class);
                startActivity(in);
            }
        });

        no_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(check_symptoms_two.this, symptoms_no.class);
                startActivity(in);
            }
        });
    }
}
