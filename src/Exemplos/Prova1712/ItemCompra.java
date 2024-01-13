package Exemplos.Prova1712;

public class ItemCompra {
    private String descricao, categoria;
    private double qtde;

    public ItemCompra(String descricao, String categoria, double qtde) {
        this.descricao = descricao;
        this.categoria = categoria;
        this.qtde = qtde;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getQtde() {
        return qtde;
    }

    public void setQtde(double qtde) {
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        return "ItemCompra{" + "descricao=" + descricao + ", categoria=" + categoria + ", qtde=" + qtde + '}';
    }
}
