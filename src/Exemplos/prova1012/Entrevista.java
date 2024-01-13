package Exemplos.prova1012;

public class Entrevista {
    int idade;
    char sexo;
    boolean empregado;
    double salarioAtual;
    
    public Entrevista(char sexo){
        this.sexo = sexo;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setEmpregado(boolean e){
        this.empregado = e;
    }
    public void setSalarioAtual(double s){
        this.salarioAtual = s;
    }
    public int getIdade(){
        return this.idade;
    }
    public char getSexo(){
        return this.sexo;
    }
    public boolean isEmpregado(){
        return empregado;
    }
    public double getSalarioAtual(){
        return this.salarioAtual;
    }
}
