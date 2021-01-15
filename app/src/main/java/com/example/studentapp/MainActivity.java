package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,rollno,admno,coll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.uname);
        rollno=(EditText)findViewById(R.id.roll);
        admno=(EditText)findViewById(R.id.admn);
        coll=(EditText)findViewById(R.id.col);
    }

    public void myclickevent(View view) {
        String getuname=name.getText().toString();
        String getroll=rollno.getText().toString();
        String getadmn=admno.getText().toString();
        String getcol=coll.getText().toString();
        Toast.makeText(this,getuname+getroll+getadmn+getcol,Toast.LENGTH_LONG).show();
    }

}


