package com.example.final2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class BMIresult extends AppCompatActivity {
    EditText weight, height;
    TextView resulttext;
    String calculation, BMIresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiresult);
        ImageButton butt1 =(ImageButton)findViewById(R.id.ib1);
        ImageButton butt2=(ImageButton)findViewById(R.id.ib2);
        ImageButton butt3 =(ImageButton)findViewById(R.id.ib3);
        ImageButton butt4=(ImageButton)findViewById(R.id.ib4);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(BMIresult.this, underweight.class);
                startActivity(int1);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(BMIresult.this, normal.class);
                startActivity(int1);
            }
        });

        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(BMIresult.this, overweight.class);
                startActivity(int1);
            }
        });

        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(BMIresult.this, obese.class);
                startActivity(int1);
            }
        });

    }

}




