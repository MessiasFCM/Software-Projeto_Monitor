package Exemplos.OO_Herança;

 
public class Funcionario {
    private String nome, cpf;
    private double salario;

    
    public Funcionario(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return  (this.nome + ", " + cpf + ", " + salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
     
}
