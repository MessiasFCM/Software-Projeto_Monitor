package Exemplos.OO_ListaDeSupermercado;

class Item {
    
    public String descricao, categoria;
    public double qtde;

    public Item (String desc, String cat, double qtde){
        this.descricao = desc;
        this.categoria = cat;
        this.qtde = qtde;
    }
    public double getQtde(){
        return qtde;
    }
    public String getCategoria(){
        return categoria;
    }
    public String getDescricao(){
        return descricao;
    }
    public String toString(){
        return(categoria + ", " + descricao+", " + qtde);
    }
}