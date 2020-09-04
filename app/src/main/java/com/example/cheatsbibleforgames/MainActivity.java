package com.example.cheatsbibleforgames;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.os.Bundle;
import android.view.MenuItem;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView btnNav = findViewById(R.id.bottomNavigationView);
        btnNav.setOnNavigationItemSelectedListener(navlistener);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_layout,new Home()).commit();
    }


        private BottomNavigationView.OnNavigationItemSelectedListener navlistener = new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //return false;
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.item1:
                        selectedFragment = new Home();
                        break;
                    case R.id.item2:
                        selectedFragment = new About();

                }
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_layout,selectedFragment).commit();
                return true;
            }
        };



}