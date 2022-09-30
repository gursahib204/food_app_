package com.example.foodappsem2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class tutorial_three extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_three);
    }


    // Going from one Activity to another through onClick
    public void gotoCreateAccountActivity(View view) {
        Intent intent = new Intent(tutorial_three.this, MainActivity2.class);
        startActivity(intent);
        Bungee.split(this);
    }
}