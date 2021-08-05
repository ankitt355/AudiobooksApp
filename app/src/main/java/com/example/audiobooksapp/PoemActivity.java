package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PoemActivity extends AppCompatActivity {

    private Button pnext1;
    private Button pnext2;
    private Button pnext3;
    private Button pnext4;
    private Button pnext5;
    private Button pnext6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);

        pnext1 = (Button) findViewById(R.id.pnext1);
        pnext2 = (Button) findViewById(R.id.pnext2);
        pnext3 = (Button) findViewById(R.id.pnext3);
        pnext4 = (Button) findViewById(R.id.pnext4);
        pnext5 = (Button) findViewById(R.id.pnext5);
        pnext6 = (Button) findViewById(R.id.pnext6);

        pnext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    startActivity(new Intent(PoemActivity.this, Poem1Activity.class));
                }
        });

        pnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PoemActivity.this, Poem2Activity.class));
            }
        });

        pnext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PoemActivity.this, Poem3Activity.class));
            }
        });

        pnext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PoemActivity.this, Poem4Activity.class));
            }
        });

        pnext5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PoemActivity.this, Poem5Activity.class));
            }
        });

        pnext6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PoemActivity.this, Poem6Activity.class));
            }
        });
    }
}