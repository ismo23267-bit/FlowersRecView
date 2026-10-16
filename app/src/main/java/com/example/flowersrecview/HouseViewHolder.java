package com.example.flowersrecview;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class HouseViewHolder extends RecyclerView.ViewHolder {
    private final TextView textView;
    public HouseViewHolder(@NonNull View itemView) {
        super(itemView);


        textView = itemView.findViewById(R.id.tv_house
        );

    }
    public void bind(String house){
        textView.setText(house);
    }

}