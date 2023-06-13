package com.example.submissionapp.viewmodel;

import android.os.Handler;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SplashViewModel extends ViewModel {

    private static final long SPLASH_SCREEN_DURATION = 2000; // 2 seconds

    private MutableLiveData<Boolean> navigationEvent = new MutableLiveData<>();

    public LiveData<Boolean> getNavigationEvent() {
        return navigationEvent;
    }

    public void startSplashScreenTimer() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                navigationEvent.setValue(true);
            }
        }, SPLASH_SCREEN_DURATION);
    }
}

