package com.example.imc;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Resultado extends AppCompatActivity {

    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvResultado= findViewById(R.id.tvResultado);

        ImageView = findViewById(R.id.imageView);

        Intent i= getIntent();
        Bundle bundle = i.getExtras();

        Float peso, altura, IMC;
        peso = bundle.getFloat("peso");
        altura = bundle.getFloat("altura");
        IMC = peso/(altura*altura);

        if(IMC<18.5){
            imageView.setImageResource(R.drawable.abaixopeso);
        }
        if(IMC>18.5 && IMC<24.9){
            imageView.setImageResource(R.drawable.normal);
        }
        if(IMC>25 && IMC<29.9){
            imageView.setImageResource(R.drawable.sobrepeso);
        }
        if(IMC>30 && IMC<34.9){
            imageView.setImageResource(R.drawable.obesidade1);
        }
        if(IMC>35 && IMC<39.9){
            imageView.setImageResource(R.drawable.obesidade2);
        }
        if(IMC>40){
            imageView.setImageResource(R.drawable.obesidade3);
        }
    }
}