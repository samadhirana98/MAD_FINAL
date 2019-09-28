package com.example.final2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class history extends AppCompatActivity {
    EditText txtid, txtname;
    Button btnSave;
    DatabaseReference dbref;
    Student std;

    private void clearControls() {
        txtid.setText("");
        txtname.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        txtid = findViewById(R.id.EtID);
        txtname = findViewById(R.id.EtName);
        btnSave = findViewById(R.id.BtnSave);

        std = new Student () ;

        dbref = FirebaseDatabase.getInstance().getReference().child("Student");
        try {
            if (TextUtils.isEmpty(txtid.getText().toString()))
                Toast.makeText(getApplicationContext(), "Enter name", Toast.LENGTH_SHORT).show();

            else {
                std.setID(txtid.getText().toString().trim());
                dbref.push().setValue(std);
                Toast.makeText(getApplicationContext(), "Data saved", Toast.LENGTH_SHORT).show();
                clearControls();
            }

        }

        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"iNVALID",Toast.LENGTH_SHORT).show();

}

    }

}
