package com.example.hw_3_3rv2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarsAdapter extends RecyclerView.Adapter<CarsViewHolder> {

    private ArrayList<Cars> carsList;

    public CarsAdapter(ArrayList<Cars> carsList) {
        this.carsList = carsList;
    }

    @NonNull
    @Override
    public CarsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CarsViewHolder carsViewHolder = new CarsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cars, parent, false));
        return carsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CarsViewHolder holder, int position) {
    Cars cars = carsList.get(position);
    holder.bind(cars.getImage(),
            cars.getName());
    }

    @Override
    public int getItemCount() {
        return carsList.size();
    }
}
