package Exemplos.Prova1712;
public class MainCatalogo {
    public static void main(String[] args) {
        CatalogoProdutos cp = new CatalogoProdutos("Prog");
        Produto p1= new Produto("desc1","departamento1");
        Produto p2= new Produto("desc2","departamento2");
        Produto p3= new Produto("desc3","departamento1");
        Produto p4= new Produto("desc4","departamento2");
        Produto p5= new Produto("desc5","departamento1");
        Produto p6= new Produto("desc6","departamento2");
        cp.addProduto(p1);
        cp.addProduto(p2);
        cp.addProduto(p3);
        cp.addProduto(p4);
        cp.addProduto(p5);
        cp.addProduto(p6);
        
        cp.imprimeItens("departamento1");
    }
}