package com.rahul.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class symptoms_no extends AppCompatActivity {
Button btn_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms_no);
        btn_home = (Button) findViewById(R.id.main_page);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(symptoms_no.this, MainActivity .class);
                startActivity(in);
            }
        });

    }
}
