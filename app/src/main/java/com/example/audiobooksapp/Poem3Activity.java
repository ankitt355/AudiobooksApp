package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Poem3Activity extends AppCompatActivity {

    private Button play3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem3);

        play3 = findViewById(R.id.play3);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.bluejay);

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    play3.setBackgroundResource(R.drawable.play);
                }else
                    mediaPlayer.start();
                play3.setBackgroundResource(R.drawable.pause);
            }
        });
    }
}