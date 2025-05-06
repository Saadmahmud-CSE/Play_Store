package com.example.playstoreapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AppAdapterGrid extends RecyclerView.Adapter<AppAdapterGrid.AppViewHolder> {
    private Context context;
    private List<AppItem> appList;

    public AppAdapterGrid(Context context, List<AppItem> appList) {
        this.context = context;
        this.appList = appList;
    }

    @NonNull
    @Override
    public AppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_app_grid, parent, false);
        return new AppViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AppViewHolder holder, int position) {
        AppItem app = appList.get(position);
        holder.appName.setText(app.getName());
        holder.appRating.setText(app.getRating());
        holder.appIcon.setImageResource(app.getImageResId());
    }

    @Override
    public int getItemCount() {
        return appList.size();
    }

    class AppViewHolder extends RecyclerView.ViewHolder {
        ImageView appIcon;
        TextView appName, appRating;

        public AppViewHolder(@NonNull View itemView) {
            super(itemView);
            appIcon = itemView.findViewById(R.id.appIcon);
            appName = itemView.findViewById(R.id.appName);
            appRating = itemView.findViewById(R.id.appRating);
        }
    }
}
