package com.example.inicioactividadforresult;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String KEY_TEXTO="key_texto"; //es una clave que guarda un valor
    private final static int REQUEST_CODE_ACTIVITY_SEGUNDO=1;
    private final static int REQUEST_CODE_ACTIVITY_TERCERO=2;

    TextView tvMensaje;
    EditText etTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etTexto=findViewById(R.id.etTexto);
        tvMensaje=findViewById(R.id.tvMensaje);
    }

    public void onClickEnviar(View v){
        String texto = etTexto.getText().toString();



        if(texto.equals("55")) {
            Intent intent= new Intent(this, SegundoActivity.class);
            intent.putExtra(KEY_TEXTO,texto);
            startActivityForResult(intent, REQUEST_CODE_ACTIVITY_SEGUNDO);
        }
        else if(texto.equals("33")){
            Intent intent= new Intent(this,TercerActivity.class);
            intent.putExtra(KEY_TEXTO,texto);
            startActivityForResult(intent, REQUEST_CODE_ACTIVITY_TERCERO);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode,resultCode,data);

        if(requestCode==REQUEST_CODE_ACTIVITY_SEGUNDO){
            if(resultCode==RESULT_OK){
                this.tvMensaje.setText(data.getStringExtra(KEY_TEXTO)+"55");
                Toast.makeText(this,"ha introducido 55",Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this,"Operacion cancelada",Toast.LENGTH_SHORT).show();
            }
        }
        else if(requestCode==REQUEST_CODE_ACTIVITY_TERCERO){
            if(resultCode==RESULT_OK){
                Toast.makeText(this,"ha introducido 33",Toast.LENGTH_SHORT).show();
                this.tvMensaje.setText(data.getStringExtra(KEY_TEXTO)+"18");
            }else{
                Toast.makeText(this,"Operacion cancelada",Toast.LENGTH_SHORT).show();
            }
        }
    }

}