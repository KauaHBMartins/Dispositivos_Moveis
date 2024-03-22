package com.example.atividadesorteio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText minEditText;
    private EditText maxEditText;
    private TextView resultTextView;
    private Button generateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minEditText = findViewById(R.id.minEditText);
        maxEditText = findViewById(R.id.maxEditText);
        resultTextView = findViewById(R.id.resultTextView);
        generateButton = findViewById(R.id.generateButton);

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateRandomNumber();
            }
        });
    }

    private void generateRandomNumber() {
        String minStr = minEditText.getText().toString();
        String maxStr = maxEditText.getText().toString();

        int min = Integer.parseInt(minStr);
        int max = Integer.parseInt(maxStr);

        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;
        resultTextView.setText("Número gerado: " + randomNumber);
    }
}