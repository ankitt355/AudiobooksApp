package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Poem4Activity extends AppCompatActivity {

    private Button play4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem4);

        play4 = findViewById(R.id.play4);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.ahousewife);

        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    play4.setBackgroundResource(R.drawable.play);
                }else
                    mediaPlayer.start();
                play4.setBackgroundResource(R.drawable.pause);
            }
        });
    }
}