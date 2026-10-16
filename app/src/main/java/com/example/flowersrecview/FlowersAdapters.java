package com.example.flowersrecview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FlowersAdapters extends RecyclerView.Adapter<FlowersViewHolder> {

    private final ArrayList<String> flowersList;

    public FlowersAdapters(ArrayList<String> flowersList) {

        this.flowersList = flowersList;
    }

    @NonNull
    @Override
    public FlowersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FlowersViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_flowers, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FlowersViewHolder holder, int position) {
        holder.bind(flowersList.get(position));
    }

    @Override
    public int getItemCount() {

        return flowersList.size();
    }
}
