/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.geradorprova;

/**
 *
 * @author 6093914
 */
public class Prova {

    /**
     * @return the nomeDisciplina
     */
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    /**
     * @param nomeDisciplina the nomeDisciplina to set
     */
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
    private String nomeDisciplina;
    private int peso;
    private String local;
    private String data;

    public Prova(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.peso = 10;
    }

    public Prova(String n, int p, String local, String data) {
        this.nomeDisciplina = n;
        this.peso = p;
        this.local = local;
        this.data = data;
    }

    public String obtemDetalhes() {
        return "Nome da disciplina: " + this.getNomeDisciplina() + "\n" + "Peso: " + this.getPeso() + "\n" + "Local: " + this.getLocal() + "\n" + "data: " + this.getData();
    }
}
