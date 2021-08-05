package com.example.audiobooksapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button signup;
    private EditText editTextEmailID, editTextPassword;
    private Button login_btn;
    private Button forgot;

    private FirebaseAuth mAuth;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signup = (Button) findViewById(R.id.signup);
        signup.setOnClickListener(this);

        login_btn = (Button) findViewById(R.id.login_btn);
        login_btn.setOnClickListener(this);

        editTextEmailID = (EditText) findViewById(R.id.email);
        editTextPassword = (EditText) findViewById(R.id.password);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        mAuth = FirebaseAuth.getInstance();

        forgot = (Button) findViewById(R.id.forgot);
        forgot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.signup:
                startActivity(new Intent(this, RegisterActivity.class));
                break;

            case R.id.login_btn:
                userLogin();
                break;

            case R.id.forgot:
                startActivity(new Intent(this, ForgotActivity.class));
                break;
        }
    }

    private void userLogin(){
        String email = editTextEmailID.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if (email.isEmpty()) {
            editTextEmailID.setError("Email Address Is Required");
            editTextEmailID.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            editTextEmailID.setError("Enter A Valid Email Address");
            editTextEmailID.requestFocus();
            return;
        }
        if (password.isEmpty()) {
            editTextPassword.setError("Password Is Required!");
            editTextPassword.requestFocus();
            return;
        }
        if (password.length() < 6) {
            editTextPassword.setError("Minimum Length Should Be 6 Characters!");
            editTextPassword.requestFocus();
            return;
        }
        progressBar.setVisibility(View.VISIBLE);

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    //redirect to userprofile
                    Toast.makeText(MainActivity.this, "User has logged in successfully", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(MainActivity.this, ProfileActivity.class));
                    progressBar.setVisibility(View.GONE);
                    finish();
            }
            else

            {
                Toast.makeText(MainActivity.this, "Failed to login! Check your Email and Password", Toast.LENGTH_LONG).show();
                progressBar.setVisibility(View.GONE);
            }
        }

        });
    }
}