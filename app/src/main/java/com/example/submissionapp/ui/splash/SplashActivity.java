package com.example.submissionapp.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.submissionapp.MainActivity;
import com.example.submissionapp.R;

public class SplashActivity extends AppCompatActivity {

    // Splash screen duration in milliseconds
    private static final int SPLASH_DURATION = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content view for the splash screen activity
        setContentView(R.layout.activity_splash);

        // Delayed execution to move to the next activity after the splash screen duration
        new Handler().postDelayed(() -> {
            // Start the next activity after the splash screen duration
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);

            // Finish the splash screen activity
            finish();
        }, SPLASH_DURATION);
    }
}
