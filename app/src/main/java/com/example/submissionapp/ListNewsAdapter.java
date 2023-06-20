package com.example.submissionapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.submissionapp.model.News;

import java.util.ArrayList;

public class ListNewsAdapter extends RecyclerView.Adapter<ListNewsAdapter.ListViewHolder>{

    private ArrayList<News>listNews;

    public ListNewsAdapter(ArrayList<News> list){
        this.listNews = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_news, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
            News news = listNews.get(position);
            Glide.with(holder.itemView.getContext())
                    .load(news.getPhoto())
                    .apply(new RequestOptions().override(105, 80))
                    .into(holder.imgPhoto);
            holder.tvName.setText(news.getName());
            holder.tvDate.setText(news.getDate());
           // holder.tvDetail.setText(news.getDetail());
    }

    @Override
    public int getItemCount() {
        return listNews.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        TextView tvDetail;
        TextView tvDate;
        ListViewHolder(View itemview){
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_item_news);
            tvName = itemview.findViewById(R.id.tv_item_name);
            tvDate = itemview.findViewById(R.id.tv_item_date);
//            tvDetail = itemview.findViewById(R.id.);
        }
    }
}
