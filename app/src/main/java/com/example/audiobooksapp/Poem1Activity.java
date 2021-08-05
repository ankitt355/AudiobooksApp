package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class Poem1Activity extends AppCompatActivity {

    private Button play1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem1);

        play1 = findViewById(R.id.play1);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.heavenoffreedom);

        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(mediaPlayer.isPlaying()){
                   mediaPlayer.pause();
                   play1.setBackgroundResource(R.drawable.play);
               }else
                   mediaPlayer.start();
               play1.setBackgroundResource(R.drawable.pause);
            }
        });

    }

}