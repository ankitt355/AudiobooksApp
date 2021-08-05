package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Trending1Activity extends AppCompatActivity {

    private Button tplay1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending1);

        tplay1 = findViewById(R.id.tplay1);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.selfmademen);

        tplay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    tplay1.setBackgroundResource(R.drawable.play);
                }else
                    mediaPlayer.start();
                tplay1.setBackgroundResource(R.drawable.pause);
            }
        });
    }
}