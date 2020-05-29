package com.rahul.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class check_symptoms extends AppCompatActivity {
    Button btn_yes, btn_no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_symptoms);
        btn_yes = (Button) findViewById(R.id.yes);
        btn_no = (Button) findViewById(R.id.no);

        btn_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(check_symptoms.this, check_symptoms_two.class);
                startActivity(in);
            }
        });

        btn_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(check_symptoms.this, check_symptoms_two.class);
                startActivity(in);
            }
        });
    }
}
