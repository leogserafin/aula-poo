package leo_serafin.edu.univali.calculadorageometrica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DadosTriangulo extends AppCompatActivity {
    private EditText base;
    private EditText altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_triangulo);
        base = (EditText) findViewById(R.id.etBaseT);
        altura = (EditText) findViewById(R.id.etAlturaT);

    }
    public void CalcTriangulo(View quemFoi) {
        boolean temErro = false;
        if(altura.getText().toString().equals("")){
            altura.setError("Altura inválida");
            Toast.makeText(this.getApplicationContext(), "Erro, altura inválida", Toast.LENGTH_SHORT).show();
            temErro = true;
        }
        if(base.getText().toString().equals("")){
            base.setError("Base inválida");
            Toast.makeText(this.getApplicationContext(), "Erro, base inválida", Toast.LENGTH_SHORT).show();
            temErro = true;
        }
        double resultado=0;
        if(!temErro){
            double Altura = Double.parseDouble( altura.getText().toString() );
            double Base = Double.parseDouble( base.getText().toString() );
            resultado = (Base*Altura)/2;
        }

        Bundle mochila = new Bundle();
        mochila.putDouble("area", resultado);
        Intent intencao = new Intent(getApplicationContext(), ResultTriangActivity.class);

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
