/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import java.util.Scanner;

public class NewClass {
    public static void main(String[]args)
    {
        Scanner teclado = new Scanner(System.in);   
        double trap,trap1,trap2,trap3;
        trap1 = teclado.nextDouble();
        trap2 = teclado.nextDouble();
        trap3 = teclado.nextDouble();
        trap=((trap1+trap2)*trap3)/2;
        System.out.println("Area do trapezio: "+trap);
    }   
}
