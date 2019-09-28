package com.example.final2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class overweight extends AppCompatActivity {
    String items[] = new String [] {"Whole grains", "Vegetables","whole fruits","nuts, seeds"};
    Button butt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overweight);
        Button butt1 =(Button)findViewById(R.id.his);
        ListView listview = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter =  new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,items);
        listview.setAdapter(adapter);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(overweight.this, history.class);
                startActivity(int1);
            }
        });
    }
}
