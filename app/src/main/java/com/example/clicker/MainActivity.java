package com.example.clicker;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    int contador = 0;

    public void click(View view){

        contador ++;

        TextView contAumenta = findViewById(R.id.cont); // Pega o Id do TextView
        String contadorText = String.valueOf(contador); // Converte o Contador de Int > String

        contAumenta.setText(contadorText); // Add o contador ja convertido na UI

        combo(contador);

    }

    public void combo(int contador){

        TextView combo = findViewById(R.id.comboText);
        String multiplicador = "";

        if(contador == 100){
            combo.setVisibility(View.VISIBLE); // Deixa o Text View Visivel
        }
        else if(contador == 200){
            multiplicador = "Combo 2X!";
            combo.setVisibility(View.VISIBLE);
            combo.setText(multiplicador);
            combo.setTextColor(Color.parseColor("#036ffc")); // Muda a cor do texto a partir do Hex
        }
        else if(contador == 500){
            multiplicador = "Combo 3X!";
            combo.setVisibility(View.VISIBLE);
            combo.setText(multiplicador);
            combo.setTextColor(Color.parseColor("#03fc4e"));
        }
        else if(contador == 1000){
            multiplicador = "Combo 4X!";
            combo.setVisibility(View.VISIBLE);
            combo.setText(multiplicador);
            combo.setTextColor(Color.parseColor("#f0fc03"));
        }
        else if(contador == 2000){
            multiplicador = "Combo 5X!";
            combo.setVisibility(View.VISIBLE);
            combo.setText(multiplicador);
            combo.setTextColor(Color.parseColor("#5a03fc"));
        }
        else if(contador >= 5000){
            multiplicador = "PARA DE CLICAR NESSA BANANA!!!";
            combo.setVisibility(View.VISIBLE);
            combo.setText(multiplicador);
            combo.setTextColor(Color.parseColor("#c70000"));
        }

    }

}