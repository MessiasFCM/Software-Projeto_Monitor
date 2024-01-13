package Exemplos.OO_ListaDeSupermercado;

import java.util.ArrayList;

class ListaDeCompra {
    public String descricao;
    public ArrayList<Item> Itens = new ArrayList<Item>();;
    
    public ListaDeCompra(String descricao){
        this.descricao=descricao;
    }
    public void addItem(Item item){
        this.Itens.add(item);
    }
    public boolean removeItem(String descricao){
        int index=0;
        for(Item i: Itens){
            index++;
            if(i.getDescricao() == descricao){
                Itens.remove(index);
                return true;
            }
        }
        return false;
    }
    public void imprimeItens(String categoria){
       if(categoria==null){
       }
       else{
           for(Item i: Itens){
               if(i.getCategoria() == categoria){
                    System.out.println(i.toString());
               }
           }
       }
    }
    public double getQtdeTotalItens(String categoria){
        double qtde = 0;
        for(Item c: this.Itens){
           if(c.getCategoria() == categoria){
               qtde = qtde+c.getQtde();
           }
        }
        return qtde;
    }
}
