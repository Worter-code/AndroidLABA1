package com.example.firstlaba;

import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;



public class MyHolder extends RecyclerView.ViewHolder {
    private TextView ItemText;
    private ImageView ItemImage;

    public MyHolder(View itemView) {
        super(itemView);
        ItemText = (TextView) itemView.findViewById(R.id.textView);
        ItemImage = (ImageView) itemView.findViewById(R.id.imageView2);
    }

    public void setItemText(String text) {

        ItemText.setText(text);
    }

    public void setItemImage() {
        ItemImage.setImageResource(R.drawable.surik);
    }
}
