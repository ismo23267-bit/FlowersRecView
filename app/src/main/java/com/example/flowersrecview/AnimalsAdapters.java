package com.example.flowersrecview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalsAdapters extends RecyclerView.Adapter<AnimalsViewHolder> {

    private final ArrayList<String> animalList;

    // Конструктор
    public AnimalsAdapters(ArrayList<String> animalList) {
        this.animalList = animalList;
    }

    @NonNull
    @Override
    public AnimalsViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent, int viewType) {

        return new AnimalsViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_animals, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(
            @NonNull AnimalsViewHolder holder, int position) {

        holder.bind(animalList.get(position));
    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }
}