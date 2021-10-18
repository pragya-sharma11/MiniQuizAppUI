package com.example.miniquizappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    Button b1;
    RadioButton r1, r2, r3, r4;
    static int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        r1 = findViewById(R.id.radioButton);
        r2 = findViewById(R.id.radioButton1);
        r3 = findViewById(R.id.radioButton2);
        r4 = findViewById(R.id.radioButton3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                if(r1.isChecked()){
                    ++score;
                }
                else {
                    score--;
                }
                Intent i = new Intent(MainActivity.this, Second.class);
                startActivity(i);
                finish();
            }
        });
    }
}