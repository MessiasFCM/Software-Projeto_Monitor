/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos.OO_Biblioteca;

 
public class Exemplar {
     private String localizacao;
     private int status;
     
     public static final int DISP = 1;
     public static final int CONS = 2;
     public static final int EMPR = 3;
     
     public static final String DISPONIVEL = "disponível";
     public static final String CONSULTA = "consulta interna";
     public static final String EMPRESTADO = "emprestado";

     
     public Exemplar(String local, int status){
         this.localizacao = local;
         this.status = status;
     }
     
    public String getLocalizacao() {
        return localizacao;
    }

   
    public int getStatus() {
        return status;
    }
    
    public boolean setStatus(int status){
        if (status != 1 && status !=2 && status!= 3)
            return false; //status inválido
        this.status = status;
        return true;
    }
     
    public String toString(){
        String situacao;
        if (this.status == 1)
            situacao = DISPONIVEL;
        else if (this.status == 2)
            situacao = CONSULTA;
        else
            situacao = EMPRESTADO;
        return this.localizacao + "Situação: "+situacao;
    }
}
