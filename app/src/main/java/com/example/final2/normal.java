package com.example.final2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class normal extends AppCompatActivity {
    String items[] = new String [] {"Whole grains", "Vegetables","whole fruits","nuts, seeds"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        ListView listview = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter =  new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,items);
        listview.setAdapter(adapter);
    }
}
