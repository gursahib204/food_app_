package com.example.foodappsem2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class tutorial_one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_one);
    }
    // Going from one Activity to another through onClick
    public void gotoTutorial2(View view) {
        Intent intent = new Intent(tutorial_one.this, tutorial_two.class);
        startActivity(intent);
        Bungee.slideLeft(this);
    }
}