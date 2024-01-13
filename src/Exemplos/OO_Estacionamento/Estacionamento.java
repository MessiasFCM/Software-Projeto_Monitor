/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exemplos.OO_Estacionamento;

import java.time.LocalDateTime;
import java.util.*;

/**
 *
 * @author Daniela
 */
public class Estacionamento {
     private String nomeEstabelecimento;
     private List<Carro> carros; 
     private double precoHora;
     
     public Estacionamento(String nome, double precoHr){
         this.nomeEstabelecimento = nome;
         this.precoHora = precoHr;
         this.carros = new ArrayList<Carro>();
     }
     
     public void chegadaCarro(Carro c){
         this.carros.add(c);
     }

    public double getPrecoHora() {
        return precoHora;
    }
      
    public Carro saidaCarro(String placa){
         for(Carro c: this.carros){
             if(c.getPlaca().equals(placa)){
                 c.setDtHoraSaida(LocalDateTime.now());
                 return c;
             }
         }
         return null;
    }
      
    public Carro pesquisaCarro(String placa){
         for(Carro c: this.carros){
             if(c.getPlaca().equals(placa)){
                 return c;
             }
         }
         return null;
     }
            
     public String imprimeCarrosParados(){
           String msg = "Relacao de Carros Parados\n"
                   + "Estabelecimento: "+this.nomeEstabelecimento
                   + "\n";
           for(Carro car: this.carros){
               if(car.getDtHoraSaida()== null)
                  msg+= car.toString() + "\n";
           }
           return msg;
     }
     
     public double totalAPagar(Carro c){
         if(c.getDtHoraSaida() == null)
             return -1;  //carro ainda não deixou o estacionamento
         return (c.getTempoPermanencia()*this.precoHora);
     }
     
     
     //Foi incluído. Não está no exercícios.
     //Para retirar um objeto Carro do ArrayList      
     public boolean remove(Carro c){
         return this.carros.remove(c); 
              //Verificar  
     } 
     
}
