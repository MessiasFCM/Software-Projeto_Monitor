package Exemplos.OO_Assosiacao1;

import java.util.ArrayList;

public class PesquisaIBOPE {
     private String idEntrevistador;
     private String setor;
     private ArrayList<Entrevista> entrevistas;
     
     public PesquisaIBOPE(String id, String setor){
            this.idEntrevistador = id;
            this.setor = setor;
            this.entrevistas = new ArrayList<>();
     }
     
     public void addEntrevista(Entrevista e){
        this.entrevistas.add(e);
     }
     
     public double calculaMediaIdade(char sexo){
         double soma = 0; int num = 0;
         for(Entrevista e: this.entrevistas){
             if (sexo == 'U'){
                 soma+=e.getIdade();
                 num++;   
             }else if (e.getSexo() == sexo){
                 soma+=e.getIdade();
                 num++;
             }    
         }
         return (soma/num);
     }
     
     public double calculaMediaSalario(char sexo){
         double soma = 0; int num = 0;
         for(Entrevista e: this.entrevistas){
             if (sexo == 'U'){
                 soma+=e.getSalarioAtual();
                 num++;   
             }else if (e.getSexo() == sexo){
                 soma+=e.getSalarioAtual();
                 num++;
             }    
         }
         return (soma/num);
     }
     
     public double calculaPercentualDesempregados(char sexo){
         double soma = 0; int num = 0;
         for(Entrevista e: this.entrevistas){
             if (sexo == 'U'){
                 num++; 
                 if (!e.isEmpregado()){
                     soma++;
                     num++;   
                 }    
             }else if (e.getSexo() == sexo){
                 num++; 
                 if (!e.isEmpregado()){
                     soma++;
                  
                 }
             }    
         }
         return (soma/num*100);
     }
 
    public static void main(String[] args) {
       PesquisaIBOPE p = new PesquisaIBOPE("1", "centro");
       Entrevista e1 = new Entrevista('F');
       e1.setIdade(23); e1.setEmpregado(true);
       e1.setSalarioAtual(1200);
       Entrevista e2 = new Entrevista('F');
       e1.setIdade(31); e2.setEmpregado(false);
       Entrevista e3 = new Entrevista('M');
       e1.setIdade(51); e3.setEmpregado(false); 
       p.addEntrevista(e1); p.addEntrevista(e2);p.addEntrevista(e3);
       System.out.println(p.calculaPercentualDesempregados('F'));
    }
}
