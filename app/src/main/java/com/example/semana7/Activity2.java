package com.example.semana7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        datos = findViewById(R.id.Text2);

        Intent intent = getIntent();

        String nombre = intent.getExtras().getString("nombre");
        datos.setText(nombre);
    }
}