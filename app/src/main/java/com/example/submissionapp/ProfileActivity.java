package com.example.submissionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView profileImage = findViewById(R.id.profileImage);
        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView emailTextView = findViewById(R.id.emailTextView);

        // Set the profile image, name, and email
        profileImage.setImageResource(R.drawable.dipda);
        nameTextView.setText("Dipda Turfaqintar Azwaj Marzuki");
        emailTextView.setText("dipdatzanel3@gmail.com");

    }
}