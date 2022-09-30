package com.example.foodappsem2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class tutorial_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_two);
    }
    // Going from one Activity to another through onClick
    public void gotoTutorial3(View view) {
        Intent intent = new Intent(tutorial_two.this, tutorial_three.class);
        startActivity(intent);
        Bungee.slideLeft(this);
    }
}