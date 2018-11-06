package leo_serafin.edu.univali.controledeabastecimento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class VisualizarLista extends AppCompatActivity {

    private RegistroAdapter registroAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_lista);

        RecyclerView rvRegistros = (RecyclerView)findViewById(R.id.rvRegistros);
        rvRegistros.setLayoutManager(new LinearLayoutManager(this.getApplicationContext()));
        registroAdapter = new RegistroAdapter();
        registroAdapter.setListaRegistros(Registro.getListaRegistros());
        rvRegistros.setAdapter(registroAdapter);
    }
}
