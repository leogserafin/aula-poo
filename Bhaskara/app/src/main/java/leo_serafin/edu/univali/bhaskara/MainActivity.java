package leo_serafin.edu.univali.bhaskara;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void CalculoRaizes(View v){
            EditText a = findViewById(R.id.etA);
            EditText b = findViewById(R.id.etB);
            EditText c = findViewById(R.id.etC);
            TextView x1 = findViewById(R.id.tvX1);
            TextView x2 = findViewById(R.id.tvX2);

            String aDigitado = a.getText().toString();
            String bDigitado = b.getText().toString();
            String cDigitado = c.getText().toString();

            if(a.equals("") || b.equals("") || c.equals("")){
                a.setError("Informe o valor de A!");
                b.setError("Informe o valor de B!");
                c.setError("Informe o valor de C!");
                return;
            }

            try{
                double aEmDouble = Double.parseDouble(aDigitado);
                double bEmDouble = Double.parseDouble(bDigitado);
                double cEmDouble = Double.parseDouble(cDigitado);

                double delta = (bEmDouble*bEmDouble)-(4*aEmDouble*cEmDouble);

                double resultadoRaiz1 = ((-bEmDouble)+(int)Math.sqrt(delta))/(2*aEmDouble);
                double resultadoRaiz2 = ((-bEmDouble)-(int)Math.sqrt(delta))/(2*aEmDouble);

                x1.setText("1 Raiz: "+resultadoRaiz1);
                x2.setText("2 Raiz: "+resultadoRaiz2);

            }catch(Exception e){
                x1.setText("Algo está errado!");
            }
        }
}
