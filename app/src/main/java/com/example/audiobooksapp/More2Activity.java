package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class More2Activity extends AppCompatActivity {

    private Button mplay2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more2);

        mplay2 = findViewById(R.id.mplay2);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.evesdiary);


        mplay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    mplay2.setBackgroundResource(R.drawable.play);
                }else
                    mediaPlayer.start();
                mplay2.setBackgroundResource(R.drawable.pause);
            }
        });


    }
}