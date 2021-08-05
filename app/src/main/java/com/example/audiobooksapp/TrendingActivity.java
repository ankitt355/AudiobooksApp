package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrendingActivity extends AppCompatActivity {

    private Button tnext1;
    private Button tnext2;
    private Button tnext3;
    private Button tnext4;
    private Button tnext5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending);

        tnext1 = (Button) findViewById(R.id.tnext1);
        tnext2 = (Button) findViewById(R.id.tnext2);
        tnext3 = (Button) findViewById(R.id.tnext3);
        tnext4 = (Button) findViewById(R.id.tnext4);
        tnext5 = (Button) findViewById(R.id.tnext5);

        tnext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TrendingActivity.this, Trending1Activity.class));
            }
        });

        tnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TrendingActivity.this, Trending2Activity.class));
            }
        });

        tnext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TrendingActivity.this, Trending3Activity.class));
            }
        });

        tnext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TrendingActivity.this, Trending4Activity.class));
            }
        });

        tnext5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TrendingActivity.this,Trending5Activity.class));
            }
        });
    }
}