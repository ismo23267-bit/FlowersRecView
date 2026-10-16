
package com.example.flowersrecview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HouseAdapters extends RecyclerView.Adapter<HouseViewHolder> {

    private final ArrayList<String> houseList;

    public HouseAdapters(ArrayList<String> houseList) {
        this.houseList = houseList;
    }

    @NonNull
    @Override
    public HouseViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent, int viewType) {

        return new HouseViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_house, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(
            @NonNull HouseViewHolder holder, int position) {

        String houseName = houseList.get(position);

        holder.bind(houseName);

        holder.itemView.setOnClickListener(view -> {

            Intent intent = new Intent(
                    view.getContext(),
                    HouseDetailActivity.class
            );

            intent.putExtra("house_name", houseName);

            view.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return houseList.size();
    }
}
