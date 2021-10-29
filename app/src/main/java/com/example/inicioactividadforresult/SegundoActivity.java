package com.example.inicioactividadforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {

    private TextView tvMensaje;
    private EditText etTexto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        tvMensaje=findViewById(R.id.tvMensaje);
        etTexto=findViewById(R.id.etTexto);

        //consigue la instancia del intent que creamos en el mainActivity
        Intent intent = getIntent();

        String texto= intent.getStringExtra(MainActivity.KEY_TEXTO);
        this.tvMensaje.setText(texto);
    }
    public void onClickEnviar(View v){

    }
}