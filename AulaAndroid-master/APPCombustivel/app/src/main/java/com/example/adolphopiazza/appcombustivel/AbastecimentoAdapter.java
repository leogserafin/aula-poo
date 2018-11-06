package com.example.adolphopiazza.appcombustivel;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import io.realm.RealmResults;

/**
 * Created by 5103789 on 27-Nov-17.
 */

public class AbastecimentoAdapter extends RecyclerView.Adapter {

    private RealmResults<Abastecimento> lista;

    public void setLista(RealmResults<Abastecimento> lista) {
        this.lista = ListaControlador.getLista();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.abastecimento_item, parent, false);
        AbastecimentoHolder holder = new AbastecimentoHolder(layoutView);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        AbastecimentoHolder gaveta = (AbastecimentoHolder) holder;
        Abastecimento atual = this.lista.get(position);
        gaveta.atualizaItem(atual);
    }

    @Override
    public int getItemCount() {
        return this.lista.size();
    }

}
