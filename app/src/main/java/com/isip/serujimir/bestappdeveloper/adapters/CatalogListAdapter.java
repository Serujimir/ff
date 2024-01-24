package com.isip.serujimir.bestappdeveloper.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.isip.serujimir.bestappdeveloper.R;
import com.isip.serujimir.bestappdeveloper.bodies.Catalog;
import com.isip.serujimir.bestappdeveloper.bodies.CatalogList;

import java.util.ArrayList;

public class CatalogListAdapter extends RecyclerView.Adapter<CatalogListAdapter.ViewHolder> {
    ArrayList<CatalogList> catalogListArrayList;
    Context context;
    LayoutInflater layoutInflater;

    public CatalogListAdapter(Context context, ArrayList<CatalogList> catalogListArrayList) {
        this.context=context;
        this.catalogListArrayList=catalogListArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.catalog_list_item, parent, false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CatalogList catalogList = catalogListArrayList.get(position);
        holder.tvCatalogListTitle.setText(catalogList.getTitle());
        holder.tvCatalogListDays.setText(catalogList.getDays());
        holder.tvCatalogListCost.setText(catalogList.getCost());
    }

    @Override
    public int getItemCount() {
        return catalogListArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView tvCatalogListTitle, tvCatalogListDays, tvCatalogListCost;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCatalogListTitle = itemView.findViewById(R.id.tvCatalogListTitle);
            tvCatalogListDays = itemView.findViewById(R.id.tvCatalogListDays);
            tvCatalogListCost = itemView.findViewById(R.id.tvCatalogListCost);
        }
    }
}
