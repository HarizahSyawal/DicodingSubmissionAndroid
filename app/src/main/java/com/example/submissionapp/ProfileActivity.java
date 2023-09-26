package com.example.submissionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("About");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));

        ImageView profileImage = findViewById(R.id.ivPicture);
        TextView nameTextView = findViewById(R.id.tvName);
        TextView emailTextView = findViewById(R.id.tvEmail);

        // Set the profile image, name, and email
        profileImage.setImageResource(R.drawable.harizah);
        nameTextView.setText("Harizah Syawal");
        emailTextView.setText("harisa1701@gmail.com");

    }
}