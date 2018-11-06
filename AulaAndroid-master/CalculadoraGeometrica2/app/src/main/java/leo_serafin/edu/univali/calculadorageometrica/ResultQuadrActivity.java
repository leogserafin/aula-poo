package leo_serafin.edu.univali.calculadorageometrica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultQuadrActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_quadr);
        double resultado = getIntent().getExtras().getDouble("area");
        TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
        tvResultado.setText( "Resultado: "+resultado+ "cm²." );
    }

    public void ComecarNovamenteQ(View QuemClicou){
        setResult(RESULT_OK);
        finish();
    }
}