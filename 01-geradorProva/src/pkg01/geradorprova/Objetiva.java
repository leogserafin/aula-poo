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
final class Objetiva extends Questao {

    /**
     * @return the opcoes
     */
    public String[] getOpcoes() {
        return opcoes;
    }

    /**
     * @param opcoes the opcoes to set
     */
    public void setOpcoes(String[] opcoes) {
        this.opcoes = opcoes;
    }

    /**
     * @return the respostaCorreta
     */
    public int getRespostaCorreta() {
        return respostaCorreta;
    }

    /**
     * @param respostaCorreta the respostaCorreta to set
     */
    public void setRespostaCorreta(int respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    private String[] opcoes;
    private int respostaCorreta;

    public Objetiva() {
        this.opcoes = new String[5];
    }
    
    @Override
    public String retornaQuestao(){
        String questao = "("+this.getPeso()+") -"+this.getPergunta()+"\n";
        String[] opcoes = this.getOpcoes();
            for(int k = 0;k<5;k++){
                questao += ((k+1)+") "+opcoes[k]+"\n");
            }
        return questao;
    }

}
