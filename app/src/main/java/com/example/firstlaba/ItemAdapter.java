package com.example.firstlaba;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;

import android.graphics.Color;



public class ItemAdapter extends RecyclerView.Adapter<MyHolder> {
    private LayoutInflater LInflater;
    public int Number;

    public ItemAdapter(Context context, int number) {
        LInflater = LayoutInflater.from(context);
        Number = number;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyHolder(LInflater.inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        if (position % 2 == 0) {
            holder.itemView.setBackgroundColor(Color.WHITE);
        } else {
            holder.itemView.setBackgroundColor(Color.GRAY);
        }
        holder.setItemText(NumberToText.converting(position + 1));
        holder.setItemImage();
    }

    @Override
    public int getItemCount() {
        return Number;
    }
}