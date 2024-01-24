package com.isip.serujimir.bestappdeveloper.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.isip.serujimir.bestappdeveloper.R;
import com.isip.serujimir.bestappdeveloper.bodies.Catalog;
import com.isip.serujimir.bestappdeveloper.bodies.News;

import java.util.ArrayList;

public class CatalogAdapter extends RecyclerView.Adapter<CatalogAdapter.ViewHolder> {
    ArrayList<Catalog> catalogArrayList;
    Context context;
    LayoutInflater layoutInflater;

    public CatalogAdapter(Context context, ArrayList<Catalog> catalogArrayList) {
        this.context=context;
        this.catalogArrayList=catalogArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.catalog_item, parent, false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Catalog catalog = catalogArrayList.get(position);
        holder.tvTitle.setText(catalog.getTitle());
    }

    @Override
    public int getItemCount() {
        return catalogArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView tvTitle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
        }
    }
}
