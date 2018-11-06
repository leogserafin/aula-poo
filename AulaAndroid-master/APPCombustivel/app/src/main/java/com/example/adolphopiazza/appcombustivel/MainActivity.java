package com.example.adolphopiazza.appcombustivel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    private TextView tvAutonomia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Realm.init(this);
        setContentView(R.layout.activity_main);

        tvAutonomia = findViewById(R.id.tvAutonomia);

        if (ListaControlador.getLista().size() > 1) {

            double kmPercorridos = ListaControlador.getLista().get(ListaControlador.getLista().size() - 1).getKilometros() - ListaControlador.getLista().get(0).getKilometros();
            double totalLitros = 0;

            for (int i = 0; i < ListaControlador.getLista().size(); i++) {
                totalLitros += ListaControlador.getLista().get(i).getLitros();
            }

            double resultado = kmPercorridos/totalLitros;

            tvAutonomia.setText(String.format("%.2f", resultado) + " km/l");
        } else {
            tvAutonomia.setText("N/A");
        }

    }

    public void visualizar_lista (View c) {
        Intent intencao = new Intent(getApplicationContext(), ListaAbastecimentos.class);
        startActivity(intencao);
    }

    public void adicionar (View c) {
        Intent intencao = new Intent(getApplicationContext(), AdicionarAbastecimento.class);
        startActivity(intencao);
    }
}
