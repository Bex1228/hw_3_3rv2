package com.example.hw_3_3rv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   private RecyclerView rv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rv_cars);
        ArrayList<Cars> cars = new ArrayList<>();

        cars.add(new Cars("BMW M5 F10", R.drawable.ic_ften));
        cars.add(new Cars("BMW M5 E60 ", R.drawable.ic_samurai));
        cars.add(new Cars("LEXUS LX570", R.drawable.ic_lx));
        cars.add(new Cars("MERCEDES-BENZ CLS ", R.drawable.ic_cls));
        cars.add(new Cars("PORSHE TAYKAN ", R.drawable.ic_taykan));


        CarsAdapter adapter = new CarsAdapter(cars);
        rv.setLayoutManager(new LinearLayoutManager(this));


        rv.setAdapter(adapter);



    }
}