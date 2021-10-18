package com.example.miniquizappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class ScorePage extends AppCompatActivity {
    Button b1;
    TextView t1;
    TextToSpeech t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_page);
        t1 = findViewById(R.id.textView4);
        b1 = findViewById(R.id.button4);
        t1.setText("Your Score : " + MainActivity.score);
        t = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                t.setLanguage(Locale.ENGLISH);
                t.setSpeechRate(1.0f);
            }
        });
        t.speak("Your Score is " + MainActivity.score, TextToSpeech.QUEUE_FLUSH,null);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.speak("Ready to retake the quiz..Here we go!!", TextToSpeech.QUEUE_FLUSH,null);
                Intent i = new Intent(ScorePage.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}