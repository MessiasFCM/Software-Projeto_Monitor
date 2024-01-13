package Testes;

public class Circulo implements Figura{
    private double raio;
    
    public Circulo( double raio){
        this.raio = raio;
    }
    @Override
    public double diametro(){
        return(2*Math.PI*this.raio);
    }
    @Override
    public double area(){
        return(Math.PI*Math.pow(this.raio, 2));
    }
    
    public static void main(String[] args) {
        
    }
}
