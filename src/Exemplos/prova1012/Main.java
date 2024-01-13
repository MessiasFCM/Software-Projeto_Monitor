/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos.prova1012;

/**
 *
 * @author Messi
 */
public class Main {
    public static void main(String[] args) {
        PesquisaIBOPE p = new PesquisaIBOPE("a", "s");

        Entrevista e1=new Entrevista ('M');
        e1.setIdade(10);
        e1.setEmpregado(false);
        e1.setSalarioAtual(1000);

        Entrevista e2=new Entrevista ('F');
        e2.setIdade(20);
        e2.setEmpregado(false);
        e2.setSalarioAtual(2000);

        Entrevista e3=new Entrevista ('U');
        e3.setIdade(30);
        e3.setEmpregado(false);
        e3.setSalarioAtual(3000);

        p.addEntrevista(e1);
        p.addEntrevista(e2);
        p.addEntrevista(e3);

        System.out.println("idade média: "+p.calculaMediaIdade('F'));
        System.out.println("Salario médio: "+p.calculaMediaSalario('F'));
        System.out.println("Porcentagem de desempregados: "+p.calculaPercentualDesempregados('U'));
    }
}