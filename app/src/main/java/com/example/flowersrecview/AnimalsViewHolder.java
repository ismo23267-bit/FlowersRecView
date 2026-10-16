package com.example.flowersrecview;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class AnimalsViewHolder extends RecyclerView.ViewHolder {
    private final TextView textView;
    public AnimalsViewHolder(@NonNull View itemView) {
        super(itemView);


        textView = itemView.findViewById(R.id.tv_animal);

    }
    public void bind(String animal){
        textView.setText(animal);
    }

}
