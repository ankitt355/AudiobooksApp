package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Poem2Activity extends AppCompatActivity {

    private Button play2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem2);

        play2 = findViewById(R.id.play2);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.wanderingsingers);

        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    play2.setBackgroundResource(R.drawable.play);
                }else
                    mediaPlayer.start();
                play2.setBackgroundResource(R.drawable.pause);
            }
        });
    }
}