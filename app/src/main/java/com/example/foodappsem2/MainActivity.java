package com.example.foodappsem2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import spencerstudios.com.bungeelib.Bungee;

public class MainActivity extends AppCompatActivity {
    ImageView splashscreenlogo;
    ProgressBar pro;
    TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        splashscreenlogo=(ImageView)findViewById(R.id.splashscreenlogo);
        pro=(ProgressBar)findViewById(R.id.pro);
        welcome=(TextView)findViewById(R.id.welcome);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(MainActivity.this, tutorial_one.class);
                startActivity(i);


                // close this activity
                finish();
                Bungee.diagonal(MainActivity.this);
            }
        }, 3000);
    }
}