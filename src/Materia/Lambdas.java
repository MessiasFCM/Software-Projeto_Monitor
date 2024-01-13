package Materia;

import Exemplos.Prova1712.Produto;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.*;
import static java.util.Collections.list;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Lambdas {
    
//    // Java - Function
//    Function<Integer, String> parOuImpar = numero -> numero % 2 == ? "Par" : "Ímpar";
//    System.out.println(parOuImpar.apply(33));
//
//    Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
//    System.out.println(parOuImpar.andThen(oResultadoE).apply(32));
//
//    // Java - Consumer
//    Consumer<Produto> imprimir = p ->  System.out.println(p.nome);
//    Produto p1 = new Produto("Caneta",12.34, 0.09);
//    imprimir.accept(p1);
//
//    // Java - Predicate
//    Predicate<Produto> isCaro = prod -> (prod,preco * (1 - prod.desconto)) >= 750;
//    Produto produto = new Produto("Notebook",3980.99, 0.15);
//    System.out.println(isCaro.test(produto));
//    
//    // Java - Predicate 2
//    Predicate<Integer> isPar = num -> num % 2 == 0;
//    Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
//    System.out.println(isPar.and(isTresDigitos).negative().test(123));
//    System.out.println(isPar.or(isTresDigitos).test(123));
//
//    // Java - Supplier
//    Supplier<list<String>> umLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
//    System.out.println(umLista.get());
//
//    // Java - UnaryOperator
//    UnaryOperator<Integer> maisDois = n -> n + 2;
//    UnaryOperator<Integer> vezesDois = n -> n * 2;
//    UnaryOperator<Integer> aoQuadrado = n -> n * n;
//
//    System.out.println(maisDois
//        .andThen(vezesDois)
//        .andThen(aoQuadrado)
//        .apply(0)); 
//
//    // Java - BinaryOperator
//    BinaryOperator<Double> media = (n1,n2) -> (n1 + n2) / 2;
//    System.out.println(media.apply);
//
//    BinaryOperator<Double, Double, String> resultado = (n1,n2) -> {
//        double notaFinal = (n1 + n2) / 2;
//        return notaFinal >= 7 ? "Aprovado" : "Reprovado";
//    };
//    
//    System.out.println(resultado.apply(9.7, 4.1));
}
