package com.example.miniquizappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScorePage extends AppCompatActivity {
    Button b1;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_page);
        t1 = findViewById(R.id.textView4);
        b1 = findViewById(R.id.button4);
        t1.setText("Your Score : " + MainActivity.score);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ScorePage.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}