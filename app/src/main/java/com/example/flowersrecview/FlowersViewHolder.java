package com.example.flowersrecview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FlowersViewHolder extends RecyclerView.ViewHolder {
    TextView textView;

    public FlowersViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tv_flowers);

    }

    public void bind(String flow) {

        textView.setText(flow);
    }

}
