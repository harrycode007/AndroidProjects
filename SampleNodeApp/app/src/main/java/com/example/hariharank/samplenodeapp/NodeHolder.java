package com.example.hariharank.samplenodeapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NodeHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView model;
    TextView manufacturer;
    TextView price;
    public View layout;

    public NodeHolder(View itemView){
        super(itemView);
        imageView = itemView.findViewById(R.id.image);
        model = itemView.findViewById(R.id.model);
        manufacturer = itemView.findViewById(R.id.manufacturer);
        price = itemView.findViewById(R.id.price);
    }

}
