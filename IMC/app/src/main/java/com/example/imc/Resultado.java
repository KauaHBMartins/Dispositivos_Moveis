package com.example.imc;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Resultado extends AppCompatActivity {

    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvResultado= findViewById(R.id.tvResultado);

        Intent i= getIntent();
        Bundle bundle = i.getExtras();
        bundle.getString("valorimc");
        Log.d(TAG "Valor do IMC:", bundle.getString("valorimc"));
    }
}