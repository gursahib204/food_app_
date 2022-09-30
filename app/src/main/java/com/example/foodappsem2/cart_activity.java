package com.example.foodappsem2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class cart_activity extends AppCompatActivity {
    View cartimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        cartimage=(View)findViewById(R.id.cartimage);

        cartimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(cart_activity.this, Payment_method.class);
                startActivity(i);
                Bungee.shrink(cart_activity.this);
            }
        });
    }
}