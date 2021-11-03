package com.example.inicioactividadforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TercerActivity extends AppCompatActivity {

    private TextView tvMensaje;
    private EditText etTexto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);

        tvMensaje=findViewById(R.id.tvMensaje);
        etTexto=findViewById(R.id.etTexto);

        //consigue la instancia del intent que creamos en el mainActivity
        Intent intent = getIntent();

        //mostramos la informacion que esta guardada en el main activity con las claves
        String texto= intent.getStringExtra(MainActivity.KEY_TEXTO);
        this.tvMensaje.setText(texto);
    }
    public void onClickEnviar(View v){
        String texto = this.etTexto.getText().toString();

        Intent intent = new Intent();
        intent.putExtra(MainActivity.KEY_TEXTO,texto);

        setResult(RESULT_OK,intent);//esto dice que se establezca como resultado a la llamada de esta ventana(boton) que establezca un ok, y muestre un mensaje
        finish();
    }
}