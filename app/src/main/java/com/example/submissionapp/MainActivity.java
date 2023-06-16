package com.example.submissionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.submissionapp.data.NewsData;
import com.example.submissionapp.model.News;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvNews;
    private ArrayList<News> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvNews = findViewById(R.id.rv_news);
        rvNews.setHasFixedSize(true);

        ImageView imageView = findViewById(R.id.rv_news);
        imageView.setClipToOutline(true);

        list.addAll(NewsData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        rvNews.setLayoutManager(new LinearLayoutManager(this));
        ListNewsAdapter listNewsAdapter = new ListNewsAdapter(list);
        rvNews.setAdapter(listNewsAdapter);
    }
}