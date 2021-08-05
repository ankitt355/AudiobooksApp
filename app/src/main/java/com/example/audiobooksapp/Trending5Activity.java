package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Trending5Activity extends AppCompatActivity {

    private Button tpart1;
    private  Button tpart2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending5);

        tpart1 = findViewById(R.id.tpart1);
        tpart2 = findViewById(R.id.tpart2);

        tpart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Trending5Activity.this, Trending5aActivity.class));
            }
        });

        tpart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Trending5Activity.this, Trending5bActivity.class));
            }
        });
    }
}