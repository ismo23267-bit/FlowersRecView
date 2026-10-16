package com.example.flowersrecview;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvFlowers;
    private final ArrayList<String> flowersList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Кнопка перехода к машинам
        Button btnCars = findViewById(R.id.btn_cars);

        btnCars.setOnClickListener(v -> {
            Intent intent = new Intent(
                    MainActivity.this,
                    Main2Activity.class
            );

            startActivity(intent);
        });

        // RecyclerView цветов
        rvFlowers = findViewById(R.id.rv_flowers);

        loadData();

        rvFlowers.setLayoutManager(new LinearLayoutManager(this));

        FlowersAdapters flowersAdapters = new FlowersAdapters(flowersList);

        rvFlowers.setAdapter(flowersAdapters);
    }

    private void loadData() {
        flowersList.add("роза");
        flowersList.add("пион");
        flowersList.add("астра");
        flowersList.add("тюльпан");
        flowersList.add("роза");
        flowersList.add("роза");
        flowersList.add("роза");
        flowersList.add("роза");
        flowersList.add("роза");
        flowersList.add("роза");
        flowersList.add("роза");
        flowersList.add("роза");
        flowersList.add("роза");
        flowersList.add("роза");
        flowersList.add("роза");
        flowersList.add("Adilet");



    }
}