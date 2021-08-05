package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Trending4Activity extends AppCompatActivity {

    private Button tplay4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending4);

        tplay4 = findViewById(R.id.tplay4);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.starlovers);

        tplay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    tplay4.setBackgroundResource(R.drawable.play);
                }else
                    mediaPlayer.start();
                tplay4.setBackgroundResource(R.drawable.pause);
            }
        });
    }
}