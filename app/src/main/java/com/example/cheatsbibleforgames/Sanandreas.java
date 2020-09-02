package com.example.cheatsbibleforgames;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Sanandreas extends AppCompatActivity {
    private RecyclerView recyclerview_sanandreas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanandreas);

        recyclerview_sanandreas = (RecyclerView)findViewById(R.id.recyclerview_sanandreas);

        recyclerview_sanandreas.setLayoutManager(new LinearLayoutManager(this));





    }



}
