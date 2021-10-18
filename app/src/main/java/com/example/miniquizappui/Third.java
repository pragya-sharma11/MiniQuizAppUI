package com.example.miniquizappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Third extends AppCompatActivity {
    Button b1;
    RadioButton r1, r2, r3, r4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        b1 = findViewById(R.id.button3);
        r1 = findViewById(R.id.radioButton8);
        r2 = findViewById(R.id.radioButton9);
        r3 = findViewById(R.id.radioButton10);
        r4 = findViewById(R.id.radioButton11);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.score = 0;
                if(r3.isChecked()){
                    ++MainActivity.score;
                }
                else {
                    MainActivity.score--;
                }
                Intent i = new Intent(Third.this, ScorePage.class);
                startActivity(i);
                finish();
            }
        });
    }
}