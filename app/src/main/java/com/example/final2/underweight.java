package com.example.final2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class underweight extends AppCompatActivity {
    String items[] = new String [] {"Whole wheat bread", "oatmeal","whole fruits","brown rice"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_underweight);
        ListView listview = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter =  new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,items);
        listview.setAdapter(adapter);
    }
}
