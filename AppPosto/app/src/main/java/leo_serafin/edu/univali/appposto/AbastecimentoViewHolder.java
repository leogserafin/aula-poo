package leo_serafin.edu.univali.appposto;

import android.content.Context;
import android.app.Application;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AbastecimentoViewHolder extends RecyclerView.ViewHolder {

    private TextView tvKm;
    private TextView tvLitros;
    private TextView tvData;
    private ImageView ivPosto;
    private TextView tvLat;
    private TextView tvLng;

    public AbastecimentoViewHolder(View itemView) {
        super(itemView);
        this.tvKm = itemView.findViewById(R.id.tvKm);
        this.tvLitros = itemView.findViewById(R.id.tvLitros);
        this.tvData = itemView.findViewById(R.id.tvData);
        this.ivPosto = itemView.findViewById(R.id.ivPosto);
        this.tvLat = itemView.findViewById(R.id.tvLat);
        this.tvLng = itemView.findViewById(R.id.tvLng);

    }

    public void atualizaGaveta(Abastecimento objetoAbastecimento){
        String km = "Km: " + String.valueOf(objetoAbastecimento.getKm());
        String litros = "Litros: " +String.valueOf(objetoAbastecimento.getLitro()) + " L";
        String posto = objetoAbastecimento.getNome();
        String lat = "Latitude: " + String.valueOf(objetoAbastecimento.getLatitude());
        String lng = "Longitude: " + String.valueOf(objetoAbastecimento.getLongitude());

        this.tvKm.setText(km);
        this.tvLitros.setText( litros );
        this.tvData.setText( objetoAbastecimento.getData() );
        this.tvLat.setText(lat);
        this.tvLng.setText(lng);


        if(posto.equals("Texaco")){
            ivPosto.setImageResource(R.drawable.untitled);
        }else if(posto.equals("Petrobras")){
            ivPosto.setImageResource(R.drawable.petrobras);
        }else if(posto.equals("Shell")){
            ivPosto.setImageResource(R.drawable.shell);
        }else if(posto.equals("Ipiranga")){
            ivPosto.setImageResource(R.drawable.ipiranga);
        }else{
            ivPosto.setImageResource(R.drawable.outros);
        }
    }
}
