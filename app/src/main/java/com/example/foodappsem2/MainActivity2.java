package com.example.foodappsem2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import spencerstudios.com.bungeelib.Bungee;


public class MainActivity2 extends AppCompatActivity {
    ImageView image;
    TextView signup;
    EditText username,loginpassword;
    Button button;
    DBHelper DB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        image=(ImageView)findViewById(R.id.image);
        signup=(TextView)findViewById(R.id.signup);
        username=(EditText)findViewById(R.id.username);
        loginpassword=(EditText)findViewById(R.id.loginpassword);
        button=(Button)findViewById(R.id.button);
        DB = new DBHelper(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, Signup.class);
                startActivity(i);
                Bungee.fade(MainActivity2.this);

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = username.getText().toString();
                String pass = loginpassword.getText().toString();

                if(user.equals("")||pass.equals(""))
                    Toast.makeText(MainActivity2.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass = DB.checkusernamepassword(user, pass);
                    if(checkuserpass==true){
                        Toast.makeText(MainActivity2.this, "Login in successfull", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(getApplicationContext(), DisplayOfMenu.class);
                        startActivity(i);
                        Bungee.inAndOut(MainActivity2.this);

                    }else{
                        Toast.makeText(MainActivity2.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });



    }

}