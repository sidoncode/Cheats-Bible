package com.example.cheatsbibleforgames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private ImageView imgcsgo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.m);

        imgcsgo = (ImageView)findViewById(R.id.imageView9);

        imgcsgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent csgo = new Intent(v.getContext(),ex.class);
                startActivity(csgo);
                finish();

            }
        });

    }


}
/**
public class MainActivity extends AppCompatActivity {

    private ImageView imgcsgo;
    private ImageView vicecity;
    private ImageView imgsanandreas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgcsgo = (ImageView) findViewById(R.id.imgcsgo);
        imgsanandreas = (ImageView) findViewById(R.id.imgsanandreas);
        vicecity  = (ImageView) findViewById(R.id.imgvicecity);

        imgsanandreas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"clicked",Toast.LENGTH_SHORT).show();
                imgsanandreas.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       Intent intent  =  new Intent(getApplicationContext(),Sanandreas.class);
                        Log.i("clicked","Clicked");
                        startActivity(intent);
                        finish();
                    }
                });

            }
        });
    }


}**/