package com.example.semana7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button boton;
    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.NombreText);
        boton = findViewById(R.id.BTAceptar);


        Button btnS = findViewById(R.id.BTAceptar);
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la segunda Activity
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                String NomImagen = nombre.getText().toString();
                intent.putExtra("nombre", NomImagen);
                // Inicia la segunda Activity
                startActivity(intent);
            }

        });

    }
}
