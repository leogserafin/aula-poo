package com.example.adolphopiazza.appcombustivel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class AdicionarAbastecimento extends AppCompatActivity {

    private EditText etKmAtual;
    private EditText etLitrosAbastecidos;
    private EditText etDataAbastecimento;
    private Spinner spPosto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_abastecimento);

        etKmAtual = findViewById(R.id.etKmAtual);
        etLitrosAbastecidos = findViewById(R.id.etLitrosAbastecidos);
        etDataAbastecimento = findViewById(R.id.etDataAbastecimento);
        spPosto = findViewById(R.id.spPosto);
    }

    public void confirma_abastecimento (View c) {

        if (etKmAtual.getText().toString().equals("") || etLitrosAbastecidos.getText().toString().equals("") || etDataAbastecimento.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }

        if (ListaControlador.getLista().size() > 0) {
            if (ListaControlador.getLista().get(ListaControlador.getLista().size() - 1).getKilometros() >= Double.parseDouble(etKmAtual.getText().toString())) {
                Toast.makeText(getApplicationContext(), "Sua quilometragem tem que ser maior do que a anterior", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        Abastecimento boo = new Abastecimento(etDataAbastecimento.getText().toString(), spPosto.getSelectedItem().toString(), Double.parseDouble(etKmAtual.getText().toString()), Double.parseDouble(etLitrosAbastecidos.getText().toString()));
        ListaControlador.AdicionarAbastecimento(boo);

        Intent intencao = new Intent(getApplicationContext(), MainActivity.class);
        intencao.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intencao);

    }
}
