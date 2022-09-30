package com.example.foodappsem2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import spencerstudios.com.bungeelib.Bungee;

public class Signup extends AppCompatActivity {
    ImageView image;
    TextView signup,haveanaccount;
    EditText username,password,password2;
    Button signupz;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        image=(ImageView)findViewById(R.id.image);
        signup=(TextView)findViewById(R.id.signup);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        password2=(EditText)findViewById(R.id.password2);
        signupz=(Button)findViewById(R.id.signupz);
        DB = new DBHelper(this);
        haveanaccount=(TextView)findViewById(R.id.haveanaccount);

        signupz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = password2.getText().toString();

                if(user.equals("")||pass.equals("")||repass.equals(""))
                    Toast.makeText(Signup.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    if(pass.equals(repass)){
                        Boolean checkuser = DB.checkusername(user);
                        if(checkuser==false){
                            Boolean insert = DB.insertData(user, pass);
                            if(insert==true){
                                Toast.makeText(Signup.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(getApplicationContext(), DisplayOfMenu.class);
                                startActivity(i);
                                Bungee.shrink(Signup.this);

                            }else{
                                Toast.makeText(Signup.this, "Registration failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(Signup.this, "User already exists! please Log In", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(Signup.this, "Passwords not matching", Toast.LENGTH_SHORT).show();
                    }
                } }

        });

        haveanaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(i);
                Bungee.shrink(Signup.this);

            }
        });



    }
}