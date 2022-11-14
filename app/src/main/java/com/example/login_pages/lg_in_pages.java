package com.example.login_pages;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.EditText;
import android.widget.TextView;

public class lg_in_pages extends AppCompatActivity {

    private Object Menu;

    @Override
    public boolean onCreatePanelMenu(int featureId, @NonNull android.view.Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.lg_in_pages,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lg_in_pages);
        EditText username=(EditText) findViewById(R.id.editTextTextPersonName);
        Intent intent = getIntent();
        String str = intent.getStringExtra("usernameValue");
        TextView text=(TextView) findViewById(R.id.textView4);
        text.setText(str);


    }
}