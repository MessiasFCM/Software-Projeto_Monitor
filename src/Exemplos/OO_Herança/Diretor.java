package Exemplos.OO_Herança;

public class Diretor extends Funcionario{
     private String nomeDepto;
     private double bonus;

    public Diretor(String nome, String cpf, double sal, String nomeDepto, double bonus){
        super(nome, cpf, sal);
        setNome(nome); setCpf(cpf); setSalario(sal); this.nomeDepto = nomeDepto;
        this.bonus = bonus;
        this.nomeDepto = nomeDepto;
        this.bonus = bonus;
    }
     
    public String toString(){
        return (super.toString() + ", "+this.nomeDepto);
    }
}
