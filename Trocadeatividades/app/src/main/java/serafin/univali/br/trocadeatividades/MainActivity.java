package serafin.univali.br.trocadeatividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("CALLBACK_LCA", "Método onpause da mainacativity");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("CALLBACK_LCA", "Método onresume da mainacativity");
    }


    public void onClickIMC(View v){
        //Toast.makeText(this, "IMC", Toast.LENGTH_LONG).show();
        //cria a intencao para trocar de tela
        Intent intencaoAbrirTelaIMC = new Intent(this.getApplicationContext(), IMCPasso1Activity.class);
        //faz a mudanca de tela!
        this.startActivity(intencaoAbrirTelaIMC);
    }

    public void onClickCGB(View v){
        Toast.makeText(this, "GCB", Toast.LENGTH_LONG).show();
        Log.d("ACAO_USUARIO", "O usuario cliclou no botao GCB");

    }
}
