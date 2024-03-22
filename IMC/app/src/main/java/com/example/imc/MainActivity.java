package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edPeso, edAltura;

    double imc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edPeso = findViewById(R.id.edPeso);
        edAltura = findViewById(R.id.edAltura);
    }

    public void calcularIMC(View view){
        double peso = Double.parseDouble(edPeso.getText().toString());
        double altura = Double.parseDouble(edAltura.getText().toString());
        String imc = String.valueOf( peso / (altura*altura));

        Log.d(imc, "calcularIMC: ");
        Toast.makeText(this, imc, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(getApplicationContext(),Resultado.class);
        intent.putExtra("altura", altura);
        intent.putExtra("peso", peso);
        startActivity(intent);
    }
}