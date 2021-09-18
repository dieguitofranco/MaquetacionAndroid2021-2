package com.df.clase1dm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Conversor extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombreUsuario");
    }

    @Override
    public void onClick(View v) {

    }

}