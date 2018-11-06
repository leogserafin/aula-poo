package leo_serafin.edu.univali.controledeabastecimento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AutonomiaAtual extends AppCompatActivity {

    private TextView tvAutonomia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autonomia_atual);

        tvAutonomia = (TextView) findViewById(R.id.tvAutonomia);
        Registro.listaRegistros = new ArrayList<>();
        Registro.carregaLista(AutonomiaAtual.this);
    }



    public double calcula(){
        if(Registro.getListaRegistros().size()<=0){
            Toast.makeText(this,"Não à registros", Toast.LENGTH_LONG).show();
            return 0;
        }else {
            double kmInicial = 0;
            double kmAtual = Registro.getListaRegistros().get(Registro.getListaRegistros().size()-1).getKmAtual();
            if(Registro.getListaRegistros().size()>1){
                kmInicial = Registro.getListaRegistros().get(0).getKmAtual();
            }
            Registro.setAutonomiaAtual((kmAtual-kmInicial)/Registro.getTotalLitros());
            return Registro.getAutonomiaAtual();
        }
    }

    public void onClickAdicionaRegistro(View v){
        Intent intent = new Intent(this.getApplicationContext(), AdicionarAbastecimento.class);
        startActivity(intent);
    }

    public void onClickVisualizarRegistros(View v){
        Intent intent = new Intent(this.getApplicationContext(), VisualizarLista.class);
        startActivity(intent);
    }

    @Override
    protected void onResume(){
        tvAutonomia.setText(String.valueOf(String.format("%.2f",calcula())));
        super.onResume();
    }

}
