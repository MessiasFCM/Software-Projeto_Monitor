package Exemplos.Prova1712;

import java.util.ArrayList;

public class EstoqueLoja {
    private String descricao;
    private ArrayList<ItemDeEstoque>itens;
    
    public EstoqueLoja(String desc){
        this.descricao = desc;
        this.itens = new ArrayList<ItemDeEstoque>();
    }
    
    public void addItem(ItemDeEstoque it){
        this.itens.add(it);
    }
    
    //Pesquisa o item com a descricao dada e retorna
    //o objeto ItemDeEstoque se encontrar.
    //Caso contrário retorna null
    public ItemDeEstoque pesquisa(String descricao){
        for(ItemDeEstoque i: itens){
            if(i.getDescricao().equals(descricao)){
                return i;
            }
        }
        return null;
    }
    
    
    //Calcula e retorna o valor total (monetário)
    //dos itens em estoque
    public double calculaValorTotalEstoque(){
        double valorTotal=0;
        for(ItemDeEstoque i: itens){
            valorTotal += i.valorEstoqueItem();
        }
        return valorTotal;
    }
     
}
