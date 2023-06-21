package com.example.submissionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.submissionapp.model.News;

public class DetailNewsActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_news);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));

        ImageView imgNews = findViewById(R.id.imgNews);
        TextView tvNewsName = findViewById(R.id.tvNewsName);
        TextView tvNewsDetail = findViewById(R.id.tvNewsDetail);

        News news = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(news != null){
            Glide.with(this)
                    .load(news.getPhoto())
                    .into(imgNews);
            tvNewsName.setText(news.getName());
            tvNewsDetail.setText(news.getDetail());
        }
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail News");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}