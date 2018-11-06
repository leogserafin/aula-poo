package com.example.adolphopiazza.appcombustivel;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 5103789 on 27-Nov-17.
 */

public class AbastecimentoHolder extends RecyclerView.ViewHolder {

    private TextView tvLitros;
    private TextView tvKm;
    private TextView tvData;
    private ImageView ivPosto;

    public AbastecimentoHolder(View itemView) {
        super(itemView);

        this.tvLitros = itemView.findViewById(R.id.tvLitros);
        this.tvKm = itemView.findViewById(R.id.tvKm);
        this.tvData = itemView.findViewById(R.id.tvData);
        this.ivPosto = itemView.findViewById(R.id.ivPosto);
    }

    public void atualizaItem (Abastecimento ab) {
        String litros = "Litros: " + Double.toString(ab.getLitros());
        tvLitros.setText(litros);
        String km = "Km: " + Double.toString(ab.getKilometros());
        tvKm.setText(km);
        tvData.setText(ab.getData());

        if (ab.getPosto().equals("Petrobras")) {
            ivPosto.setImageResource(R.drawable.petrobras);
        } else if (ab.getPosto().equals("Texaco")) {
            ivPosto.setImageResource(R.drawable.texaco);
        } else if (ab.getPosto().equals("Shell")) {
            ivPosto.setImageResource(R.drawable.shell);
        } else if (ab.getPosto().equals("Ipiranga")) {
            ivPosto.setImageResource(R.drawable.ipiranga);
        } else {
            ivPosto.setImageResource(R.drawable.outros);
        }
    }
}
