package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Poem5Activity extends AppCompatActivity {

    private Button play5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem5);

        play5 = findViewById(R.id.play5);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.animmorality);

        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    play5.setBackgroundResource(R.drawable.play);
                }else
                    mediaPlayer.start();
                play5.setBackgroundResource(R.drawable.pause);
            }
        });
    }
}