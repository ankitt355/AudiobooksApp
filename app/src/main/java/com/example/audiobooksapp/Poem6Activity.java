package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Poem6Activity extends AppCompatActivity {

    private Button play6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem6);

        play6 = findViewById(R.id.play6);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.silver);

        play6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    play6.setBackgroundResource(R.drawable.play);
                }else
                    mediaPlayer.start();
                play6.setBackgroundResource(R.drawable.pause);
            }
        });
    }
}