package Exemplos.Prova1712;

import java.util.ArrayList;

public class Produto {
    private String descricao;
    private String departamento;

    
    public Produto(String desc, String departamento){
        this.descricao = desc;
        this.departamento = departamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDepartamento() {
        return departamento;
    }
    public String toString(){
        return (this.descricao+"-"+this.departamento);
    }
}
