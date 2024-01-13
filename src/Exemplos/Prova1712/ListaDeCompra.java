package Exemplos.Prova1712;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompra {
    private ArrayList<ItemCompra> lista;
    
    public ListaDeCompra(){
        this.lista = new ArrayList<ItemCompra>();
    }
    
    //Adiciona um item de compra à lista
    public void adiciona(ItemCompra it){
        this.lista.add(it);
    }
    
    //Exclui o primeiro item da lista de compra
    // com descrição igual ao parâmetro 'desc'
    //(ignorando case). Se excluir o metodo 
    //retorna true, caso contrário, o método
    //returna false.
    public boolean exclui(String desc){
        for(ItemCompra it: this.lista)
            if (it.getDescricao().equalsIgnoreCase(desc)){
                return this.lista.remove(it);
            }    
        return false;  
    }
    
    //Imprime todos os itens da lista de compra
    public void imprimeItens(){
        for(ItemCompra it: this.lista) 
             System.out.println(it);
                
    }
    
    //Imprime os itens da lista de compra
    //com categoria igual (ignorando case) 
    //ao parâmetro 'c'
    public void imprimeItens(String c){
        for(ItemCompra it: this.lista) 
            if (it.getCategoria().equalsIgnoreCase(c))
               System.out.println(it);
    }
    
    //INSIRA O CÓDIGO DO MÉTODO MAIN
    public static void main(String[] args) {
        ListaDeCompra i1 = new ListaDeCompra();
        Scanner teclado = new Scanner(System.in);
        String descricao, categoria;
        double quantidade;
        int n = 0;
        while(n!=2){
            n = teclado.nextInt();
            if(n == 1){
                descricao = teclado.next();
                categoria = teclado.next();
                quantidade = teclado.nextDouble();
                ItemCompra ic1 = new ItemCompra(descricao, categoria, quantidade);
                i1.adiciona(ic1);
            }
        }
        i1.imprimeItens();
    }    
}
