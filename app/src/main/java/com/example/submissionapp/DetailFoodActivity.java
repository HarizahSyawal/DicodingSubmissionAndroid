package com.example.submissionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.submissionapp.model.Foods;

import org.w3c.dom.Text;

public class DetailFoodActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_food);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));

        ImageView imgFood = findViewById(R.id.ivPoster);
        TextView tvFoodName = findViewById(R.id.tvTitle);
        TextView tvFoodDesc = findViewById(R.id.tvDesc);
        TextView tvTotal = findViewById(R.id.tvTotal);
        TextView tvIngredient = findViewById(R.id.tvIngredients);
        RatingBar rbFood = findViewById(R.id.ratingBar);

        Foods foods = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(foods != null){
            Glide.with(this)
                    .load(foods.getPhoto())
                    .into(imgFood);
            tvFoodName.setText(foods.getName());
            tvFoodDesc.setText(foods.getDetail());
            tvTotal.setText(foods.getPrice());
            tvIngredient.setText(foods.getIngredient());
            rbFood.setRating(foods.getRating());

        }
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Food");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}