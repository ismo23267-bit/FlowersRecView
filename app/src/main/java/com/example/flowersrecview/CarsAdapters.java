package com.example.flowersrecview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarsAdapters extends RecyclerView.Adapter<CarsViewHolder> {

    private  final ArrayList<String> carsList;

    public CarsAdapters(ArrayList<String> carsList) {

        this.carsList = carsList;
    }

    @NonNull
    @Override
    public CarsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarsViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_cars, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CarsViewHolder holder, int position) {
        holder.bind(carsList.get(position));
    }

    @Override
    public int getItemCount() {

        return carsList.size();
    }
}
