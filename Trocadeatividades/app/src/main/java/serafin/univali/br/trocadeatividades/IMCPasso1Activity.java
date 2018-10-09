package serafin.univali.br.trocadeatividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class IMCPasso1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imcpasso1);
    }

    public void onClickAvancar(View v){
        EditText etAltura = findViewById(R.id.etAltura);
        EditText etPeso = findViewById(R.id.etPeso);

        double altura = Double.parseDouble(etAltura.getText().toString());
        double peso = Double.parseDouble(etPeso.getText().toString());

        Intent intencaAbrirIMCResultado = new Intent(this.getApplicationContext(), IMCResultadoActivity.class);

        //mandando dados para outra actvity
        intencaAbrirIMCResultado.putExtra("altura", altura);
        intencaAbrirIMCResultado.putExtra("peso", peso);

        this.startActivity(intencaAbrirIMCResultado);

    }
}
