package com.example.comparativo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resultado(View view){

        int bebida1;
        int bebida2;

        EditText valor1, valor2;
        TextView finalizado = findViewById(R.id.textView);
        valor1 = findViewById((R.id.txtValor1));
        valor2 = findViewById((R.id.txtValor2));

        try {
            bebida1 = Integer.parseInt(valor1.getText().toString().replaceAll(",", ""));
            bebida2 = Integer.parseInt((valor2.getText().toString().replaceAll(",","")));

            if(bebida1 > bebida2)
                finalizado.setText("A Segunda opção é melhor");
            else
                finalizado.setText("A Primeira opção é melhor");

        }catch (NumberFormatException nfe){
            System.out.println("Erro: " + nfe);
            finalizado.setText("ERRO!");
        }


    }

}