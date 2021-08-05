package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class More3Activity extends AppCompatActivity {

    private Button mplay3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more3);

        mplay3 = findViewById(R.id.mplay3);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.grasshopperandant);

        mplay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    mplay3.setBackgroundResource(R.drawable.play);
                }else
                    mediaPlayer.start();
                mplay3.setBackgroundResource(R.drawable.pause);
            }
        });
    }
}