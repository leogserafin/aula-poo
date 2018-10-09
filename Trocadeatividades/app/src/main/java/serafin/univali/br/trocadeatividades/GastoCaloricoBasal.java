package serafin.univali.br.trocadeatividades;

/**
 * Created by 6093914 on 09/10/2018.
 */
import java.io.Serializable;

public class GastoCaloricoBasal implements Serializable{
    private double altura;
    private double peso;
    private int idade;
    private char sexo;

    public double getResultado(){
        double resultado = 0;
        if(this.getSexo() == 'F'){
            resultado = 655 + (9.6 * this.getPeso()) + (1.8 * this.getAltura()) - (4.7 * this.getIdade());
        }else{
            resultado = 655 + (13.7 * this.getPeso()) + (5 * this.getAltura()) - (6.8 * this.getIdade());
        }
        return resultado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
