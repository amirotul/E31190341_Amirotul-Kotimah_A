package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_splash);

        SystemClock.sleep(3000);
        Intent login = new Intent(com.example.project.SplashActivity.this, MainActivity.class);
        startActivity(login);
        finish();
    }
}
