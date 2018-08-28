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
public class GeradorProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prova x = new Prova("POO2", 7, "Lab 3 - Bloco B6", "28/08/2018");
        System.out.println(x.obtemDetalhes());
        Prova y = new Prova("POO2");
        System.out.println(y.obtemDetalhes());
        Objetiva o = new Objetiva();
        
        o.setPergunta("Qual o melhor time do Brasil?");
        o.setPeso(3);
        String[] opcoes = new String[5];
        opcoes[0] = "Gremio";
        opcoes[1] = "São Paulo";
        opcoes[2] = "Flamengo";
        opcoes[3] = "Corinthians";
        opcoes[4] = "Internacional";
        
        o.setOpcoes(opcoes);
        o.setRespostaCorreta(3);
    }

}
