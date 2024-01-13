package Exemplos.Prova1712;

public class ItemDeEstoque {
    private String descricao;
    private double qtde, precoUnit;
    
    public ItemDeEstoque(String desc, double qtde, double preco){
        this.descricao = desc;
        this.qtde = qtde;
        this.precoUnit = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getQtde() {
        return qtde;
    }

    
    public double getPreco() {
        return precoUnit;
    }
    
    public double valorEstoqueItem(){
        return (this.qtde*this.precoUnit);
    }
    
    public String toString(){
        return (this.descricao+"-"+  this.valorEstoqueItem());
    }
}
