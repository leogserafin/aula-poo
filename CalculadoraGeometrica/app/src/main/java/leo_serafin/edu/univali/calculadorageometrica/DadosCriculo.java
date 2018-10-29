package leo_serafin.edu.univali.calculadorageometrica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class DadosCriculo extends AppCompatActivity {
    private EditText raio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_criculo);
        raio = (EditText) findViewById(R.id.etRaio);
    }

    public void CalcCirculo(View quemFoi) {
        boolean temErro = false;
        if (raio.getText().toString().equals("")) {
            raio.setError("Raio inválido");
            Toast.makeText(this.getApplicationContext(), "Erro, informe o raio", Toast.LENGTH_SHORT).show();
            temErro = true;
        }

        double resultado = 0;
        if (!temErro) {
            double r = Double.parseDouble(raio.getText().toString());
            resultado = r * r * 3.141592654;
        }
        Bundle mochila = new Bundle();
        mochila.putDouble("area", resultado);
        Intent intencao = new Intent(getApplicationContext(), ResultCirculoActivity.class);

        intencao.putExtras(mochila);

        startActivityForResult(intencao, 10);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==10 && resultCode==RESULT_OK) {
            finish();
        }else{
            return;
        }
    }
}
