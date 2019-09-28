package com.example.final2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity {

        EditText weight, height;
        TextView resulttext;
        String calculation, BMIresult;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_bmi);
            weight = findViewById(R.id.weight);
            height = findViewById(R.id.height);
            resulttext = findViewById(R.id.result);
            Button btn5 = (Button) findViewById(R.id.calculate_button);
            Button btn6 = (Button) findViewById(R.id.diet);
            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calculateBMI();
                }
            });
            btn6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent int1 = new Intent(BMI.this, BMIresult.class);
                    startActivity(int1);
                }
            });
        }

        private void calculateBMI() {

            String s1 = weight.getText().toString();
            String s2 = height.getText().toString();

            float weightValue = Float.parseFloat(s1);
            float heightValue = Float.parseFloat(s2)/100  ;

            float H = heightValue * heightValue;
            float bmi = weightValue/ H;

            if(bmi < 18.5){
                BMIresult = "Under Weight";
            }else if(bmi >= 18.5 && bmi <=24.5){
                BMIresult = "Normal Weight";
            }else if(bmi >=25 && bmi<= 29.5){
                BMIresult = "Overweight";
            }else{
                BMIresult="Obese";
            }
            calculation = "Result: "  + bmi  + "\n" +        BMIresult ;
            resulttext.setText(calculation);
        }


    }