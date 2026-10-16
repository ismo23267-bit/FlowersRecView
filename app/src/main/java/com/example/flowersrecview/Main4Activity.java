package com.example.flowersrecview;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

    private RecyclerView rvHouse;
    private final ArrayList<String> houseList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main4);

        Button btnBack = findViewById(R.id.btn_back_house);

        btnBack.setOnClickListener(v -> {
            finish();
        });

        rvHouse = findViewById(R.id.rv_house);

        loadData();

        rvHouse.setLayoutManager(new LinearLayoutManager(this));

        HouseAdapters houseAdapters = new HouseAdapters(houseList);

        rvHouse.setAdapter(houseAdapters);
    }

    private void loadData() {
        houseList.add("Особняк");
        houseList.add("Кирпичный");
        houseList.add("Коттедж");
        houseList.add("Деревянный дом");
        houseList.add("Таунхаус");
    }

    }

