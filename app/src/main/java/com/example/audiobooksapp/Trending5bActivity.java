package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Trending5bActivity extends AppCompatActivity {

    private Button tpart2play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending5b);

        tpart2play = findViewById(R.id.tpart2play);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.thegame2);

        tpart2play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    tpart2play.setBackgroundResource(R.drawable.play);
                }else
                    mediaPlayer.start();
                tpart2play.setBackgroundResource(R.drawable.pause);
            }
        });
    }
}