package com.example.submissionapp.ui.splash;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.submissionapp.MainActivity;
import com.example.submissionapp.R;
import com.example.submissionapp.viewmodel.SplashViewModel;


public class SplashActivity extends AppCompatActivity {

    private SplashViewModel splashViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashViewModel = new ViewModelProvider(this).get(SplashViewModel.class);

        // Observe any data or events from the ViewModel
        splashViewModel.getNavigationEvent().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean navigateToNextScreen) {
                if (navigateToNextScreen) {
                    navigateToNextActivity();
                }
            }
        });

        splashViewModel.startSplashScreenTimer();
    }

    private void navigateToNextActivity() {
        // Navigate to the next activity or perform any necessary actions
        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}

