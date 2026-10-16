package com.example.flowersrecview;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HouseDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_house_detail);

        TextView tvHouseName = findViewById(R.id.tv_house_name);

        String houseName = getIntent().getStringExtra("house_name");

        if (houseName != null && !houseName.isEmpty()) {
            tvHouseName.setText(houseName);
        } else {
            tvHouseName.setText("Название дома не найдено");
        }
        Button btnBack = findViewById(R.id.btn_back_detail);

        btnBack.setOnClickListener(v -> {
            finish();
        });
    }
}
