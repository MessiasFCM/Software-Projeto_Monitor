package Exemplos.OO_UrnaEletronica;

public class Candidato {
    
    int numCandidato;
    long numVotos;
    String cargo, nome;
    
    public Candidato(int numCandidato, String cargo, String nome){
        this.numCandidato = numCandidato;
        this.cargo = cargo;
        this.nome = nome;
    }
    public void adicionarVoto(){
        this.numVotos++;
    }
    public int getNumCandidato(){
        return this.numCandidato;
    }
    public String getCargo(){
        return this.cargo;
    }
    public String getNome(){
        return this.nome;
    }
    public long getNumVotos(){
        return this.numVotos;
    }
    public String toString(){
        return this.numCandidato + "-" + this.nome + "-" + this.cargo + ": " + this.numVotos; 
    }
}
