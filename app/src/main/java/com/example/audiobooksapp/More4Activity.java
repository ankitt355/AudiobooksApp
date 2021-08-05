package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class More4Activity extends AppCompatActivity {

    private Button mplay4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more4);

        mplay4 = findViewById(R.id.mplay4);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.thenecklace);

        mplay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    mplay4.setBackgroundResource(R.drawable.play);
                }else
                    mediaPlayer.start();
                mplay4.setBackgroundResource(R.drawable.pause);
            }
        });
    }
}