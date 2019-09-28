package com.example.final2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button butt1 =(Button)findViewById(R.id.button);
        Button butt2=(Button)findViewById(R.id.button2);
        Button butt3 =(Button)findViewById(R.id.button3);
        Button butt4=(Button)findViewById(R.id.button4);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(MainActivity.this, BMI.class);
                startActivity(int1);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(MainActivity.this, Water.class);
                startActivity(int1);
            }
        });

        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(MainActivity.this, Alarm.class);
                startActivity(int1);
            }
        });

        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(MainActivity.this, Cal.class);
                startActivity(int1);
            }
        });

    }


    public void calculateBMI(View view) {
    }
}
