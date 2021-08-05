package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoreActivity extends AppCompatActivity {

    private Button mnext1;
    private Button mnext2;
    private Button mnext3;
    private Button mnext4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        mnext1 = (Button)findViewById(R.id.mnext1);
        mnext2 = (Button)findViewById(R.id.mnext2);
        mnext3 = (Button)findViewById(R.id.mnext3);
        mnext4 = (Button)findViewById(R.id.mnext4);

        mnext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MoreActivity.this, More1Activity.class));
            }
        });

        mnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MoreActivity.this, More2Activity.class));
            }
        });

        mnext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MoreActivity.this, More3Activity.class));
            }
        });

        mnext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MoreActivity.this, More4Activity.class));
            }
        });

    }
}