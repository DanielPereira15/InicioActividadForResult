package com.example.inicioactividadforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String KEY_TEXTO="key_texto";
    private final static int REQUEST_CODE_ACTIVITY_SEGUNDO=1;
    EditText etTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etTexto=findViewById(R.id.etTexto);
    }

    public void onClickEnviar(View v){

        Intent intent= new Intent(this, SegundoActivity.class);
        String texto = etTexto.getText().toString();
        intent.putExtra(KEY_TEXTO,texto);

        startActivityForResult(intent,REQUEST_CODE_ACTIVITY_SEGUNDO);
    }


}