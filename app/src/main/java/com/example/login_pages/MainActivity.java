package com.example.login_pages;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText username=(EditText) findViewById(R.id.editTextTextPersonName);
        EditText password=(EditText) findViewById(R.id.editTextTextPersonName2);
        Button login=(Button) findViewById(R.id.button2);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("zainab") && password.getText().toString().equals("123456")) {
                    Toast.makeText(MainActivity.this, "Log in successful", Toast.LENGTH_LONG).show();
                    Intent move=new Intent(MainActivity.this,lg_in_pages.class);
                    move.putExtra("usernameValue",username.getText().toString());
                    startActivity(move);


                } else
                    Toast.makeText(MainActivity.this, "Log in failed", Toast.LENGTH_LONG).show();

            }
        });
        Button signup=(Button) findViewById(R.id.button);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move2=new Intent(MainActivity.this,Sign_up_pages.class);
                startActivity(move2);
            }
        });

        }
    }
