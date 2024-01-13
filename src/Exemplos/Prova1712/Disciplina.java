
package Exemplos.Prova1712;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private ArrayList<Avaliacao> avaliacoes;

    public Disciplina(String nome){
        this.nome = nome;
        this.avaliacoes = new ArrayList<Avaliacao>();
    }

    public void addAvaliacao(Avaliacao it){
        this.avaliacoes.add(it);
    }
    public double calculaPontuacaoTotal(){
        double total = 0;
        for(Avaliacao a: avaliacoes){
            total+= a.getQtdePontos();
        }
        return total;
    }
} 
