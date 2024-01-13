package Exemplos.prova1012;

import java.util.ArrayList;

public class PesquisaIBOPE {
    public String idEntrevistador, setor;
    public ArrayList<Entrevista> entrevistas;
    
    public PesquisaIBOPE(String idEntrevistador, String setor)
    {
        this.idEntrevistador = idEntrevistador;
        this.setor = setor;
        entrevistas = new ArrayList<Entrevista>();
    }
    public void addEntrevista(Entrevista e)
    {
       this.entrevistas.add(e);
    }
    public double calculaMediaIdade(char sexo)
    {
        int idT = 0;
        int cont = 0;
        if(sexo == 'U'){
            cont = entrevistas.size();
            for(Entrevista e: entrevistas){
             idT += e.getIdade();
            }
        }else{
            for(Entrevista e: entrevistas){
                if(sexo == e.getSexo()){
                    idT += e.getIdade();
                    cont++;
                }
            }
        }
        return (idT/cont);
    }
    public double calculaMediaSalario(char sexo)
    {
        double saT = 0;
        int cont = 0;
        
        if(sexo == 'U'){
            cont = entrevistas.size();
            for(Entrevista e: entrevistas){
                saT += e.getSalarioAtual();
            }
        }else{
            for(Entrevista e: entrevistas){
                if(sexo == e.getSexo()){
                    saT += e.getSalarioAtual();
                    cont++;
                }
            }
        }
        return (saT/cont);
    }
    public double calculaPercentualDesempregados(char sexo)
    {
        double des = 0;
        double cont = 0;
        
        if(sexo == 'U'){
            cont = entrevistas.size();
            for(Entrevista e: entrevistas){
                if(!e.isEmpregado()){
                    des++;
                }
            }
        }else{
            for(Entrevista e: entrevistas){
                if(sexo == e.getSexo()){
                    cont++;
                    if(!e.isEmpregado()){
                        des++;
                    }
                }
            }
        }
        return (des/cont*100);
    }
}