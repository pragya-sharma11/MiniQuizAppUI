package com.example.miniquizappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button b1;
    RadioButton r1, r2, r3, r4;
    static int score=0;
    TextToSpeech t;
    String r="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        r1 = findViewById(R.id.radioButton);
        r2 = findViewById(R.id.radioButton1);
        r3 = findViewById(R.id.radioButton2);
        r4 = findViewById(R.id.radioButton3);
        t = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                t.setLanguage(Locale.ENGLISH);
                t.setSpeechRate(1.0f);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                if(r1.isChecked()){
                    ++score;
                    r = "r1";
                }
                else {
                    score--;
                    if(r2.isChecked())
                        r = "r2";
                    else if(r3.isChecked())
                        r = "r3";
                    else if(r4.isChecked())
                        r = "r4";
                }
                t.speak("You have selected " + r + " and now we are moving to next question", TextToSpeech.QUEUE_FLUSH,null);
                Intent i = new Intent(MainActivity.this, Second.class);
                startActivity(i);
                finish();
            }
        });
    }
}