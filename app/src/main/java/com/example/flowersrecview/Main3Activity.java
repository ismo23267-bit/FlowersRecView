package com.example.flowersrecview;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    private RecyclerView rvAnimals;
    private final ArrayList<String> animalsList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);

        // Кнопка назад к машинам
        Button btnBack = findViewById(R.id.btn_back_animals);

        btnBack.setOnClickListener(v -> {
            finish();
        });

        // Кнопка перехода к домам
        Button btnHouse = findViewById(R.id.btn_house);

        btnHouse.setOnClickListener(v -> {
            Intent intent = new Intent(
                    Main3Activity.this,
                    Main4Activity.class
            );

            startActivity(intent);
        });

        // RecyclerView животных
        rvAnimals = findViewById(R.id.rv_animals);

        loadData();

        rvAnimals.setLayoutManager(new LinearLayoutManager(this));

        AnimalsAdapters animalsAdapters = new AnimalsAdapters(animalsList);

        rvAnimals.setAdapter(animalsAdapters);
    }



    private void loadData() {
        animalsList.add("Лев");
        animalsList.add("Тигр");
        animalsList.add("Слон");
        animalsList.add("Волк");
        animalsList.add("Медведь");
        animalsList.add("Лиса");
        animalsList.add("Жираф");
    }
}