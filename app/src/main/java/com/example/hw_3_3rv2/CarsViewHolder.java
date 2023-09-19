package com.example.hw_3_3rv2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class CarsViewHolder extends RecyclerView.ViewHolder {

    private TextView tvName;
    private ImageView ivPhoto;
    public CarsViewHolder(@NonNull View itemView) {
        super(itemView);

        tvName = itemView.findViewById(R.id.tv_name);
        ivPhoto = itemView.findViewById(R.id.iv_photo);
    }
    public void bind(int carPhoto, String carName){
    ivPhoto.setImageDrawable(ContextCompat.getDrawable(ivPhoto.getContext(),carPhoto ));
        tvName.setText(carName);
    }
}
