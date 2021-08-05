package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Trending5aActivity extends AppCompatActivity {

    private Button tpart1play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending5a);

        tpart1play = findViewById(R.id.tpart1play);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.thegame1);

        tpart1play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    tpart1play.setBackgroundResource(R.drawable.play);
                }else
                    mediaPlayer.start();
                tpart1play.setBackgroundResource(R.drawable.pause);
            }
        });
    }
}