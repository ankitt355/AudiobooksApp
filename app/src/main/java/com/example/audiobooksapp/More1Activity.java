package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class More1Activity extends AppCompatActivity {

    private Button mplay1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more1);

        mplay1 = findViewById(R.id.mplay1);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.storyofanhour);

        mplay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    mplay1.setBackgroundResource(R.drawable.play);
                }else
                    mediaPlayer.start();
                mplay1.setBackgroundResource(R.drawable.pause);
            }
        });

    }
}