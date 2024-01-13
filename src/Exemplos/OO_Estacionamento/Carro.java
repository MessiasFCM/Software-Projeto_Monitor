/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos.OO_Estacionamento;
import java.time.*;
import java.time.format.*;

/**
 *
 * @author Daniela
 */
public class Carro {
     private String placa, cor, modelo;
     private LocalDateTime dtHoraChegada, dtHoraSaida;
     
     public Carro(String placa, String cor, String modelo, LocalDateTime dtHora){
         this.placa = placa;
         this.modelo = modelo;
         this.cor = cor;
         this.dtHoraChegada = dtHora;
         this.dtHoraSaida = null;
     }

    public void setDtHoraSaida(LocalDateTime dtHoraSaida) {
        this.dtHoraSaida = dtHoraSaida;
    }

    public String getPlaca() {
        return placa;
    }

    public LocalDateTime getDtHoraSaida() {
        return dtHoraSaida;
    }
    
    public double getTempoPermanencia(){
        Duration d = Duration.between(this.dtHoraChegada, 
                       this.dtHoraSaida);
        return (d.toMinutes()/60.0); //para divisao exata. O retorno é em horas, ainda que seja com fração da hora
    }
     
    public String getDuracao(){
        Duration d = Duration.between(this.dtHoraChegada, 
                       this.dtHoraSaida);
        return (d.toHours()+":"+d.toMinutes());
    }
    
    public String toString(){
         String dtHora = this.dtHoraChegada.format(
                 DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm:ss"));
         return this.placa + " - Data/Hora de chegada: "+dtHora;
    }
}
