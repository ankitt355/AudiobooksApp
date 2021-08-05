package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Trending2Activity extends AppCompatActivity {

    private Button tplay2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending2);

        tplay2 = findViewById(R.id.tplay2);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.ladyortiger);

        tplay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    tplay2.setBackgroundResource(R.drawable.play);
                }else
                    mediaPlayer.start();
                tplay2.setBackgroundResource(R.drawable.pause);
            }
        });
    }
}