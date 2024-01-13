package Exemplos.Prova1712;

import java.util.ArrayList;

public class Staff {
    private String depto;
    private ArrayList<Funcionario> membros;
    
    public Staff(String depto){
        this.depto = depto;
        this.membros = new ArrayList<Funcionario>();
    }
    
    public void addFuncionario(Funcionario it){
        this.membros.add(it);
    }
    
    public double maiorSalario(){
        double maior=0;
        for(Funcionario f: membros){
            if(f.getSalario()>maior){
                maior = f.getSalario();
            }
        }
        return maior;
    }
}
