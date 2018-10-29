package leo_serafin.edu.univali.calculadorageometrica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;


public class CalculadoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
    }


    public void ProximaTela(View quemClicou) {
        RadioGroup fGeometrica = (RadioGroup) findViewById(R.id.fGeometrica);
        if (fGeometrica.getCheckedRadioButtonId() == -1) {
            Toast.makeText(getApplicationContext(), "Selecione a forma", Toast.LENGTH_SHORT).show();
            return;
        }

        if (fGeometrica.getCheckedRadioButtonId() == R.id.Quadrado) {
            Intent intencao = new Intent(getApplicationContext(), DadosQuadrado.class);
            startActivity(intencao);

        } else {
            if (fGeometrica.getCheckedRadioButtonId() == R.id.Triangulo) {
                Intent intencao = new Intent(getApplicationContext(), DadosTriangulo.class);
                startActivity(intencao);
            } else {
                Intent intencao = new Intent(getApplicationContext(), DadosCriculo.class);
                startActivity(intencao);
            }
        }

    }
}
