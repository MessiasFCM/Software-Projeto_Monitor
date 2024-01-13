package Exemplos.OO_Assosiacao2;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompra {
    private ArrayList<Item> lista;
    
    public ListaDeCompra(){
        this.lista = new ArrayList<Item>();
    }
    
    //Adiciona um item de compra à lista
    public void addItem(Item it){
        this.lista.add(it);
    }
    
    //Exclui o primeiro item da lista de compra
    // com descrição igual ao parâmetro 'desc'
    //(ignorando case). Se excluir o metodo 
    //retorna true, caso contrário, o método
    //returna false.
    public boolean removeItem(String desc){
        for(Item it: this.lista)
            if (it.getDescricao().equalsIgnoreCase(desc)){
                return this.lista.remove(it);
            }    
        return false;  
    }
    
    //Imprime todos os itens da lista de compra
    public void imprimeItens(){
        for(Item it: this.lista) 
             System.out.println(it);
                
    }
    
    //Imprime os itens da lista de compra
    //com categoria igual (ignorando case) 
    //ao parâmetro 'c'
    public void imprimeItens(String c){
        for(Item it: this.lista) 
            if (it.getCategoria().equalsIgnoreCase(c))
               System.out.println(it);
    }
    
    
    //Retorna a quantidade total de itens de uma categoria
    public double getQtdeTotalItens(String cat){
        double qtde = 0;
        for(Item it: this.lista) 
            if (it.getCategoria().equalsIgnoreCase(cat))
               qtde+= it.getQtde();
        return qtde; 
    }
    
    
    public static void main(String[] args) {
         ListaDeCompra l = new ListaDeCompra();
         Scanner in = new Scanner(System.in);
         int op; String d, c; double qtde;
         do{
             System.out.println("1. adicionar item \n2.Sair\nEscolha: ");
             op = in.nextInt();
             switch(op){
                 case 1:
                     System.out.println("Dê a descrição:");
                     d = in.next();
                     System.out.println("Dê a categoria:");
                     c = in.next();
                     System.out.println("Dê a qtde:");
                     qtde = in.nextDouble();
                     l.addItem(new Item(d, c, qtde));
                     break;
                 case 2:   
                     break;
             }
         }while(op!=2);
         System.out.println("Dê a categoria:");
         c = in.next();
         l.imprimeItens(c);
         System.out.println(l.getQtdeTotalItens(c));

    }
  
}

