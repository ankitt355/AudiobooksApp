package com.example.audiobooksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {

    private Button logoutbtn;
    private Button trendingbtn;
    private Button morebtn;
    private Button poembtn;
    private Button aboutbtn;
    private Button profilebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        logoutbtn = (Button) findViewById(R.id.logoutbtn);

        trendingbtn = (Button) findViewById(R.id.trendingbtn);

        morebtn = (Button) findViewById(R.id.morebtn);

        poembtn = (Button) findViewById(R.id.poembtn);

        aboutbtn = (Button) findViewById(R.id.aboutbtn);

        profilebtn = (Button) findViewById(R.id.profilebtn);



        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(ProfileActivity.this, "User has logged out successfully", Toast.LENGTH_LONG).show();
                startActivity(new Intent(ProfileActivity.this, MainActivity.class));
                finish();
            }
        });

        trendingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, TrendingActivity.class));
            }
        });

        morebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, MoreActivity.class));
            }
        });

        poembtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, PoemActivity.class));
            }
        });

        aboutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, AboutActivity.class));
            }
        });

        profilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, MyProfileActivity.class));
            }
        });


    }
}