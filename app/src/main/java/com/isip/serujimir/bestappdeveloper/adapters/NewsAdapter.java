package com.isip.serujimir.bestappdeveloper.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.isip.serujimir.bestappdeveloper.R;
import com.isip.serujimir.bestappdeveloper.bodies.News;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    ArrayList<News> newsArrayList;
    Context context;
    LayoutInflater layoutInflater;

    public NewsAdapter(Context context, ArrayList<News> newsArrayList) {
        this.context=context;
        this.newsArrayList=newsArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.news_item, parent, false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        News news = newsArrayList.get(position);

        holder.tvText1.setText(news.getText1());
        holder.tvText2.setText(news.getText2());
        holder.tvText3.setText(news.getText3());
        holder.image.setImageDrawable(news.getDrawable());
    }

    @Override
    public int getItemCount() {
        return newsArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView tvText1, tvText2,tvText3;
        final ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvText1 = itemView.findViewById(R.id.tvText1);
            tvText2 = itemView.findViewById(R.id.tvText2);
            tvText3 = itemView.findViewById(R.id.tvText3);
            image = itemView.findViewById(R.id.Image);
        }
    }
}
