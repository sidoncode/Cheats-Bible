package com.cheatsdev.cheatsbibleforgames;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.cheatsdev.cheatsbibleforgames.R;
import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class Appintro extends AppIntro {


    SharedPreferences mSharedPreferences;
    SharedPreferences.Editor sharedprefeditor;

    public void transtion_main_activity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_appintro);

       // getSupportActionBar().hide();

        addSlide(AppIntroFragment.newInstance("Welcome to the app","first slide", R.drawable.first,
                ContextCompat.getColor(getApplicationContext(),R.color.grey)));



        mSharedPreferences  = getApplicationContext().getSharedPreferences("MyPreferences", Context.MODE_PRIVATE);

        sharedprefeditor  = mSharedPreferences.edit();

        if(mSharedPreferences !=null){
            boolean checkshared = mSharedPreferences.getBoolean("checkstate",false);

            if(checkshared == true){
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        }

    }


    @Override
    public void  onSkipPressed(Fragment currentFragment) {

        super.onSkipPressed(currentFragment);
            // Decide what to do when the user clicks on "Skip"
            transtion_main_activity();
            sharedprefeditor.putBoolean("checkstate",false).commit();


            finish();
    }

    @Override
        public void  onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Decide what to do when the user clicks on "Done"
        transtion_main_activity();
        sharedprefeditor.putBoolean("checkstate",true).commit();
        finish();
    }
}