package com.example.cheatsbibleforgames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgpubg;
    private ImageView vicecity;
    private ImageView imgsanandreas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgpubg = (ImageView) findViewById(R.id.imgpubg);
        imgsanandreas = (ImageView) findViewById(R.id.imgsanandreas);
        vicecity = (ImageView) findViewById(R.id.imgvicecity);

        imgsanandreas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sanandreas();
            }
        });
    }

    public void sanandreas(){
        Intent intentsandreas = new Intent(this,Sanandreas.class);
    }








}