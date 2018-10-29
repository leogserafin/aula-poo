package serafin.univali.br.trocadeatividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class IMCResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imcresultado);

        //recebendo dados da outra tela!!
        double altura = this.getIntent().getDoubleExtra("altura", -1);
        double peso = this.getIntent().getDoubleExtra("peso",-1);
        double imc = peso/Math.pow(altura,2);

        TextView tvResultado = findViewById(R.id.tvResultadoIMC);
        tvResultado.setText(""+imc);
        NumberFormat nf = DecimalFormat.getInstance();
        //limita as virgulas em apenas 1
        nf.setMaximumFractionDigits(1);

        tvResultado.setText(""+DecimalFormat.getInstance().format(imc));
        
    }


}
