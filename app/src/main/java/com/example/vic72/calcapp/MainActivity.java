package com.example.vic72.calcapp;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bu1 = (Button) findViewById(R.id.button);
        bu1.setOnClickListener(this);

        Button bu2 = (Button) findViewById(R.id.button2);
        bu2.setOnClickListener(this);

        Button bu3 = (Button) findViewById(R.id.button3);
        bu3.setOnClickListener(this);

        Button bu4 = (Button) findViewById(R.id.button4);
        bu4.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        n1 = (EditText) findViewById(R.id.editText);
        n2 = (EditText) findViewById(R.id.editText2);


        Intent intent = new Intent(this, keisan.class);


        if (n1.length() != 0 && n2.length() != 0) {


            double num = Double.parseDouble(n1.getText().toString());
            double num2 = Double.parseDouble(n2.getText().toString());


            intent.putExtra("n1", num);
            intent.putExtra("n2", num2);

            if (v.getId() == R.id.button) {
                intent.putExtra("button", R.id.button);
            } else if (v.getId() == R.id.button2) {
                intent.putExtra("button2", R.id.button2);
            } else if (v.getId() == R.id.button3) {
                intent.putExtra("button3", R.id.button3);
            } else if (v.getId() == R.id.button4) {
                intent.putExtra("button4", R.id.button4);

            }

            startActivity(intent);


        }else {
            Toast.makeText(this, "未入力です", Toast.LENGTH_LONG).show();
        }

    }



}
