package com.example.sergey.myferstandroidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myscrin);

        TextView tV =(TextView)findViewById(R.id.textView);
        tV.setText("Измененный ");
    }
}
