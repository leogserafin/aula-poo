package com.example.adolphopiazza.appcombustivel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListaAbastecimentos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_abastecimentos);

        RecyclerView rvLista = findViewById(R.id.rvLista);
        AbastecimentoAdapter adaptador = new AbastecimentoAdapter();
        adaptador.setLista(ListaControlador.getLista());
        rvLista.setLayoutManager(new LinearLayoutManager(this.getApplicationContext()));
        rvLista.setAdapter(adaptador);
    }
}
