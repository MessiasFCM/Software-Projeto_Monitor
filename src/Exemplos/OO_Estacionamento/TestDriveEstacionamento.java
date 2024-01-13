/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos.OO_Estacionamento;

import java.time.LocalDateTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniela
 */
public class TestDriveEstacionamento {
    public static void main(String[] args) {
         
        String nome = JOptionPane.showInputDialog("Dê o nome do estabelecimento");
        double precoHr = Double.parseDouble(JOptionPane.showInputDialog("Dê o preço da hora"));
        Estacionamento e = new Estacionamento(nome, precoHr);
         
        int op; String placa, cor, modelo; Carro c;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(
                      "1. Registrar entrada de Carro\n"
                    + "2. Pesquisar Carro pela placa \n"
                    + "3. Registrar saída de Carro\n"          
                    + "4. Imprimir relação de carros parados \n"
                    + "5. SAIR"));
            switch(op){
                case 1:
                    placa = JOptionPane.showInputDialog("Dê a placa");
                    cor = JOptionPane.showInputDialog("Dê a cor");
                    modelo = JOptionPane.showInputDialog("Dê o modelo do carro");
                    //LocalDateTime dtHrEntrada = LocalDateTime.now();
                    //c = new Carro(placa, cor, modelo, dtHrEntrada);
                    //e.chegadaCarro(c);
                    e.chegadaCarro(new Carro(placa, cor, modelo, LocalDateTime.now()));
                    break;
                case 2: 
                    placa = JOptionPane.showInputDialog("Dê a placa");
                    c = e.pesquisaCarro(placa);
                    if (c == null)
                        JOptionPane.showMessageDialog(null, "Carro inexistente");
                    else
                        JOptionPane.showMessageDialog(null, "Dados do Carro:\n "+c);
                    break;
                case 3:
                    placa = JOptionPane.showInputDialog("Dê a placa");
                    c = e.saidaCarro(placa);
                    if (c == null){
                        JOptionPane.showMessageDialog(null, "Carro inexistente: ");
                    }else{
                        double precoAPagar = c.getTempoPermanencia() * e.getPrecoHora();
                        JOptionPane.showMessageDialog(null, "Placa: " + c.getPlaca() + 
                                                            "\nPermanência: "+c.getDuracao()+
                                                            "\nTotal a pagar: "+precoAPagar);
                        e.remove(c);  //exclui o carro do ArrayList<Carro> carros 
                                      //do objeto e (Estacionamento)
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,e.imprimeCarrosParados());
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida");
            }
         }while(op!= 5);
    }
}
