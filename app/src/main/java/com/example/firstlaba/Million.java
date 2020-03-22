package com.example.firstlaba;

import android.app.Activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class Million extends Activity {

    private RecyclerView recyclerView;
    private ItemAdapter recycleViewCustomAdapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_million);
        recycleViewCustomAdapter = new ItemAdapter(this, 1000000); // Создаем список на 1 миллион элементов
        recyclerView = new RecyclerView(this);

        recyclerView.setAdapter(recycleViewCustomAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setHasFixedSize(true);
        setContentView(recyclerView); //отображаем настроенный список элементов на экране
    }
}
