package Exemplos.OO_Herança;
 
public class Gerente extends Funcionario{
    private int senha, numFuncGerenciados;

    public Gerente(String nome, String cpf, double sal, int senha, int funcs){
        super(nome, cpf, sal);
        this.senha = senha;
        this.numFuncGerenciados = funcs;
    }
    
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setNumFuncGerenciados(int numFuncGerenciados) {
        this.numFuncGerenciados = numFuncGerenciados;
    }
    
    public boolean autentica(int senha){
        if (this.senha == senha){
            System.out.println(this.getNome() + " acesso permitido!");
            return true;
        }else{
            System.out.println(this.getNome()+ " acesso negado!");
            return false;
        }
    }

    @Override
    public String toString() {
        return (super.toString() +"\n"+
                "senha=" + this.senha + ", numFuncGerenciados=" + this.numFuncGerenciados);
    }
    
}
