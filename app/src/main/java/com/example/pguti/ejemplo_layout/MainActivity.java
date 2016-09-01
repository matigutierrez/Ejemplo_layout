package com.example.pguti.ejemplo_layout;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText texto = (EditText) findViewById(R.id.campo);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent =  new Intent(MainActivity.this, MainActivity2.class);
                //startActivity(intent);
                setContentView(R.layout.activity_main2);
                final TextView texto2 = (TextView)findViewById(R.id.mostrar);
                setNombre(texto.getText().toString());
                texto2.setText(getNombre());
            }
        });
    }
}
