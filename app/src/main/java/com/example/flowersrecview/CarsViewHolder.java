package com.example.flowersrecview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarsViewHolder extends RecyclerView.ViewHolder {

    TextView textView;

    public CarsViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.tv_cars);
    }

    public void bind(String car) {
        textView.setText(car);
    }
}