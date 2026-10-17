package com.example.flowersrecview;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private RecyclerView rvCars;
    private final ArrayList<String> carsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        Button btnAnimals = findViewById(R.id.btn_animals);

        btnAnimals.setOnClickListener(v -> {
            Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
            startActivity(intent);
        });


        // Кнопка возвращения к цветам
        Button btnBack = findViewById(R.id.btn_back);

        btnBack.setOnClickListener(v -> {
            finish();
        });


        // RecyclerView машин
        rvCars = findViewById(R.id.rv_cars);

        loadData();

        rvCars.setLayoutManager(new LinearLayoutManager(this));

        CarsAdapters carsAdapters = new CarsAdapters(carsList);

        rvCars.setAdapter(carsAdapters);
    }

    private void loadData() {
        carsList.add("BMW");
        carsList.add("Mercedes");
        carsList.add("Toyota");
        carsList.add("Honda");
        carsList.add("BYD");
        carsList.add("Lexus");

    }
}