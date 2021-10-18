package com.example.miniquizappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Second extends AppCompatActivity {
    Button b1;
    RadioButton r1, r2, r3, r4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b1 = findViewById(R.id.button2);
        r1 = findViewById(R.id.radioButton4);
        r2 = findViewById(R.id.radioButton5);
        r3 = findViewById(R.id.radioButton6);
        r4 = findViewById(R.id.radioButton7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.score = 0;
                if(r1.isChecked()){
                    ++MainActivity.score;
                }
                else {
                    MainActivity.score--;
                }
                Intent i = new Intent(Second.this, Third.class);
                startActivity(i);
                finish();
            }
        });
    }
}