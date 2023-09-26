package com.example.submissionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageButton;

import com.example.submissionapp.data.FoodsData;
import com.example.submissionapp.model.Foods;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvFoods;
    private ArrayList<Foods> list = new ArrayList<>();

    private ViewPager2 viewPager;
    private ImageSliderAdapter imageSliderAdapter;
    private int currentPosition = 0;
    private Timer timer;
    private final long DELAY_MS = 3000; // Delay in milliseconds before the slide changes
    private final long PERIOD_MS = 5000; // Interval in milliseconds between each slide


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageButton = findViewById(R.id.profile);

        rvFoods = findViewById(R.id.rv_foods);
        rvFoods.setHasFixedSize(true);

        list.addAll(FoodsData.getListData());
        showRecyclerList();

        viewPager = findViewById(R.id.viewPager);
        imageSliderAdapter = new ImageSliderAdapter(getImageList(), this);
        viewPager.setAdapter(imageSliderAdapter);

        // Start automatic sliding
        startAutoSlide();

        //Profile Button
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the next profile activity
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        // Optional: Add page change listener to handle manual slide change
        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                currentPosition = position;
            }
        });
        // Optional: Pause sliding when the user interacts with the slider
        viewPager.setOnTouchListener((v, event) -> {
            stopAutoSlide();
            return false;
        });

    }

    private List<Integer> getImageList() {
        List<Integer> images = new ArrayList<>();
        images.add(R.drawable.food1);
        images.add(R.drawable.food2);
        images.add(R.drawable.food3);
        images.add(R.drawable.food4);
        images.add(R.drawable.food5);
        images.add(R.drawable.food6);
        return images;
    }

    private void startAutoSlide() {
        Handler handler = new Handler(Looper.getMainLooper());
        Runnable runnable = new Runnable() {
            public void run() {
                if (currentPosition == imageSliderAdapter.getItemCount() - 1) {
                    currentPosition = 0;
                } else {
                    currentPosition++;
                }
                viewPager.setCurrentItem(currentPosition);
            }
        };

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(runnable);
            }
        }, DELAY_MS, PERIOD_MS);
    }

    private void stopAutoSlide() {
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }

    private void showRecyclerList() {
        rvFoods.setLayoutManager(new LinearLayoutManager(this));
        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(list);
        rvFoods.setAdapter(listFoodAdapter);

        listFoodAdapter.setOnItemClickCallback(new ListFoodAdapter.OnItemClickCallback(){
            @Override
            public void onItemClicked(Foods foods){
                Intent moveIntent = new Intent(MainActivity.this, DetailFoodActivity.class);
                moveIntent.putExtra(DetailFoodActivity.ITEM_EXTRA, foods);
                startActivity(moveIntent);
            }
        });
    }
}