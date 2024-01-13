package Exemplos.Prova1712;

import java.util.ArrayList;

public class CatalogoProdutos {
    private String estabelecimentos;
    private ArrayList<Produto> produtos;
    
    public CatalogoProdutos(String desc){
        this.estabelecimentos = desc;
        this.produtos = new ArrayList<Produto>();
    }
    
    public void addProduto(Produto it){
        this.produtos.add(it);
    }
    
    //Pesquisa um Produto dada a sua descrição
    // o método retorna null se não encontrado
    // ou o objeto Produto, caso contrário
    public Produto pesquisa(String descricao){
        for(Produto p: produtos){
            if(p.getDescricao().equals(descricao)){
                return p;
            }
        }
        return null;
        
//        for(int i=0;i<produtos.size();i++){
//            if(descricao.equals(produtos.get(i).getDescricao())){
//                return produtos.get(i);
//            }
//        }
//        return null;
    } 
        
    //Imprime todos os itens de um determinado depto
    public void imprimeItens(String depto){
        for(Produto p: produtos){
            if(p.getDepartamento().equals(depto)){
                System.out.println(p.toString());
            }
        }
        
//        for(int cont=0;cont<produtos.size();cont++){
//            if(depto.equals(produtos.get(cont).getDepartamento())){
//                System.out.println(produtos.get(cont).toString());
//            }
//        }
    } 
}
