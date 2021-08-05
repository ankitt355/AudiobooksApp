package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Trending3Activity extends AppCompatActivity {

    private Button tplay3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending3);

        tplay3 = findViewById(R.id.tplay3);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.matchgirl);

        tplay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    tplay3.setBackgroundResource(R.drawable.play);
                }else
                    mediaPlayer.start();
                tplay3.setBackgroundResource(R.drawable.pause);
            }
        });
    }
}