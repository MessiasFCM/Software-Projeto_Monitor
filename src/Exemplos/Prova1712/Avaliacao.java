package Exemplos.Prova1712;

import java.time.LocalDate;
import java.time.format.*;

public class Avaliacao {
    private String descricao;
    private double qtdePontos;
    private LocalDate data;

    public Avaliacao(String desc, double qtdePontos, LocalDate data){
        this.descricao = desc;
        this.qtdePontos = qtdePontos;
        this.data = data;
    }

    public String getNome() {
        return descricao;
    }

    public double getQtdePontos() {
        return qtdePontos;
    }

    public LocalDate getData() {
        return data;
    }


    public String toString(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return (this.descricao+" "+ this.data.format(formato)
                +" "+ " "+this.qtdePontos+" ");
    }
}