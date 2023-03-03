package com.example.laboratorio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView insecto;
    private Button botonSiguiente;
    private Button botonAnterior;
    private TextView textoInsecto;
    private ImageView imagenInsecto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insecto = (TextView)findViewById(R.id.nombreInsecto);
        textoInsecto = (TextView)findViewById(R.id.textoInsecto);
        imagenInsecto = (ImageView)findViewById(R.id.imagenInsecto);

        botonSiguiente = (Button)findViewById(R.id.botonSiguiente);
        botonAnterior = (Button) findViewById(R.id.botonAnterior);

        botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insecto.setText(R.string.mariquita);
                textoInsecto.setText(R.string.insecto_mariquita);
                imagenInsecto.setImageResource(R.drawable.mariquita);
            }
        });

        botonAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insecto.setText(R.string.abeja);
                textoInsecto.setText(R.string.insecto_abeja);
                imagenInsecto.setImageResource(R.drawable.abeja);
            }
        });

        }
    }


