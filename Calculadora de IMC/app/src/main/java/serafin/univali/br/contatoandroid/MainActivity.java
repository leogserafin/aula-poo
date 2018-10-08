package serafin.univali.br.contatoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


        public void CalculoIMC(View v){
            EditText a = findViewById(R.id.etPeso);
            EditText altura = findViewById(R.id.etAltura);
            EditText c
            TextView imc = findViewById(R.id.tIMC);

            String alturaDigitada = altura.getText().toString();
            String pesoDigiado = peso.getText().toString();

            if(alturaDigitada.equals("") || pesoDigiado.equals("")){
                altura.setError("Informe a altura!");
                peso.setError("Informe o peso!");
                return;
            }

            try {
                double alturaEmDouble = Double.parseDouble(alturaDigitada);
                double pesoEmDouble = Double.parseDouble(pesoDigiado);

                double resultadoIMC = pesoEmDouble/(alturaEmDouble*alturaEmDouble);
                imc.setText("IMC: "+resultadoIMC);

                imc.setVisibility(View.VISIBLE);
            }catch (Exception e){
                imc.setText("errou!!!");
            }


        }
}
