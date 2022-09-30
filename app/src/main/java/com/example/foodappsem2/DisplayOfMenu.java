package com.example.foodappsem2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import spencerstudios.com.bungeelib.Bungee;

public class DisplayOfMenu extends AppCompatActivity {
    ImageView map,chicken,camera,pics;
    private static final int PICK_IMAGE = 100;
    Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_of_menu);
        map=(ImageView)findViewById(R.id.map);
        chicken=(ImageView)findViewById(R.id.chicken);
        camera=(ImageView)findViewById(R.id.camera);
        pics=(ImageView)findViewById(R.id.pics);



        pics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
              //  startActivityForResult(gallery,PICK_IMAGE);

                Intent i = new Intent(DisplayOfMenu.this, OpenGallery.class);
                startActivity(i);
                Bungee.split(DisplayOfMenu.this);

            }
        });


        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DisplayOfMenu.this, OpenCamera.class);
                startActivity(i);
                Bungee.split(DisplayOfMenu.this);
            }
        });


        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DisplayOfMenu.this, MapsActivity.class);
                startActivity(i);
                Bungee.card(DisplayOfMenu.this);
            }
        });

        chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(DisplayOfMenu.this, cart_activity.class);
                startActivity(i);
                Bungee.shrink(DisplayOfMenu.this);

            }
        });
    }
}