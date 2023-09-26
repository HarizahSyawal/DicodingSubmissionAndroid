package com.example.submissionapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.submissionapp.model.Foods;

import java.util.ArrayList;

public class ListFoodAdapter extends RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>{

    private ArrayList<Foods>listFoods;

    public ListFoodAdapter(ArrayList<Foods> list){
        this.listFoods = list;
    }

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_foods, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
            Foods foods = listFoods.get(position);
            Glide.with(holder.itemView.getContext())
                    .load(foods.getPhoto())
                    .apply(new RequestOptions().override(105, 80))
                    .into(holder.imgPhoto);
            holder.tvName.setText(foods.getName());
            holder.tvPrice.setText(foods.getPrice());
            holder.rbFood.setRating(foods.getRating());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemClickCallback.onItemClicked(listFoods.get(holder.getAbsoluteAdapterPosition()));
                }
            });
    }

    @Override
    public int getItemCount() {
        return listFoods.size();
    }

    public interface OnItemClickCallback {
        void onItemClicked(Foods data);
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        TextView tvPrice;
        RatingBar rbFood;
        ListViewHolder(View itemview){
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.ivPoster);
            tvName = itemview.findViewById(R.id.tvTitle);
            tvPrice = itemview.findViewById(R.id.tvPrice);
            rbFood = itemview.findViewById(R.id.rbFood);
        }
    }
}
