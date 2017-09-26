package com.example.vic72.calcapp;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class keisan extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keisan);

        Intent intent = getIntent();


        double val = intent.getDoubleExtra("n1", 0);
        double va2 = intent.getDoubleExtra("n2", 0);

        int bu = intent.getIntExtra("button", 0);
        int bu2 = intent.getIntExtra("button2", 0);
        int bu3 = intent.getIntExtra("button3", 0);
        int bu4 = intent.getIntExtra("button4", 0);


        TextView m1 = (TextView) findViewById(R.id.textView);
        if (bu == R.id.button) {
            m1.setText(String.valueOf(val + va2));

        }else if (bu2 == R.id.button2) {

       m1.setText(String.valueOf(val - va2));
        }else if (bu3 == R.id.button3){
        m1.setText(String.valueOf(val * va2));
     }else if(bu4 == R.id.button4) {
     m1.setText(String.valueOf(val / va2));


    }

} }


