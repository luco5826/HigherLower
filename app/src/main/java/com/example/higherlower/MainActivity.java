package com.example.higherlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = (int) (Math.random() * 100);
    }

    public void testNumberHandler(View view) {
        String numeroInseritoStringa = ((EditText) findViewById(R.id.inputNumber)).getText().toString();

        int inputDato = -1;
        try {
            inputDato = Integer.parseInt(numeroInseritoStringa);
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Per favore, inserisci un numero", Toast.LENGTH_SHORT).show();
            return;
        }

        if (inputDato < number) {
            Toast.makeText(MainActivity.this, R.string.too_low, Toast.LENGTH_SHORT).show();
        } else if (inputDato > number) {
            Toast.makeText(MainActivity.this, R.string.too_high, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, R.string.guessed, Toast.LENGTH_SHORT).show();
        }
    }

}
