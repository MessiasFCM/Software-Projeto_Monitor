/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

/**
 *
 * @author Messi
 */
public class Triangulo implements Figura{
    double altura, base;
    
    public Triangulo(double b, double a){    
        this.altura = a;
        this.base = b;
    }
    public double diametro(){
        return((this.base*this.altura)/2);
    }
    public double area(){
        return(this.base);
    }
}
