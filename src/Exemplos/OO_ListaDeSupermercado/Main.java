package Exemplos.OO_ListaDeSupermercado;

public class Main {
    public static void main(String[] args) {
        
        Item i1 = new Item("maça","comida",31);
        Item i2 = new Item("biscoito","comida",20);
        Item i3 = new Item("cerveja","bebida",12);
        ListaDeCompra l1 = new ListaDeCompra("fd");
        i1.toString();
        System.out.println(i1);
        l1.addItem(i1);
        l1.addItem(i2);
        l1.addItem(i3);
        System.out.println(l1.getQtdeTotalItens("comida"));
    }
}
