package com.example.login_pages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sign_up_pages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_pages);

        Button signup=(Button) findViewById(R.id.button3);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText username=(EditText) findViewById(R.id.editTextTextPersonName3);
                EditText password=(EditText) findViewById(R.id.editTextTextPersonName4);
                EditText email=(EditText) findViewById(R.id.editTextTextPersonName5);
                TextView name=(TextView) findViewById(R.id.textView8);
                TextView pass=(TextView) findViewById(R.id.textView9);
                TextView emaill=(TextView) findViewById(R.id.textView10);
                name.setText(username.getText().toString());
              pass.setText(password.getText().toString());
                emaill.setText(email.getText().toString());
            }
        });

    }
}