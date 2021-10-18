package com.example.miniquizappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.Locale;

public class Second extends AppCompatActivity {
    Button b1;
    RadioButton r1, r2, r3, r4;
    TextToSpeech t;
    String r="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b1 = findViewById(R.id.button2);
        r1 = findViewById(R.id.radioButton4);
        r2 = findViewById(R.id.radioButton5);
        r3 = findViewById(R.id.radioButton6);
        r4 = findViewById(R.id.radioButton7);
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
                MainActivity.score = 0;
                if(r4.isChecked()){
                    ++MainActivity.score;
                    r = "r4";
                }
                else {
                    MainActivity.score--;
                    if(r1.isChecked())
                        r = "r1";
                    else if(r2.isChecked())
                        r = "r2";
                    else if(r3.isChecked())
                        r = "r3";
                }
                t.speak("You have selected " + r + " and now we are moving to next question", TextToSpeech.QUEUE_FLUSH,null);
                Intent i = new Intent(Second.this, Third.class);
                startActivity(i);
                finish();
            }
        });
    }
}