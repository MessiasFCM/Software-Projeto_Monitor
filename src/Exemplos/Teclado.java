package Exemplos;
/*
    Essa Class é um exemplo de como usar o Teclado(Scanner), feito por @MessiasFCM 
*/
import java.util.Scanner;

public class Teclado {
    
    public static void main(String[] args) {
        
        String texto;
        int inteiro;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva um texto: ");
        texto = teclado.nextLine();
        System.out.println("Escreva um número: ");
        inteiro = teclado.nextInt();
        
        teclado.close();
       
        System.out.println("Texto: " + texto + "\n" + "Número: " + inteiro);
    }
}
