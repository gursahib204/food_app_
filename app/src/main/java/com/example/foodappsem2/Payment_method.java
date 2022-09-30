package com.example.foodappsem2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class Payment_method extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);
    }
    // Going from one Activity to another through onClick
    public void gotoPaymentGatewayActivity(View view) {
        Intent intent = new Intent(Payment_method.this, PaymentGatwayActivity.class);
        startActivity(intent);
        Bungee.diagonal(Payment_method.this);
    }
}