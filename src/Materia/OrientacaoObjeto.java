package Materia;
/**
 * Essa Class é uma explicação do Básico do Java, feito por @MessiasFCM
 */
public class OrientacaoObjeto {

    private static void pilaresOO() {
        /*
            Encapsulamento - Encapsulamento se refere à construção do objeto de modo a proteger o acesso direto a seus 
                             dados internos. Tratar objetos como capsula significa agrupar propriedades e métodos que 
                             estão diretamente relacionados dentro de um mesmo objeto. Além disso é preciso permitir 
                             que essas propriedades sejam acessadas apenas através de métodos da interface pública do objeto.

            Modificadores de Acesso 
                Public - permite acesso a qualquer código externo a classe.
                Protected - permite acesso às classes filhas, mas proíbe a qualquer outro acesso externo.
                Private - proíbe qualquer acesso externo à própria classe, inclusive das classes filhas.
        
        
            Herança - seria um ramo de uma classe principal.
                    
            Exemplo:
                Temos um animal, e dessa classe animal temos mamíferos e anfíbios que são as heranças dessa classe animal, 
                e da classe mamíferos, temos as classes mamíferos aquáticos e mamíferos terrestres que serão heranças da 
                classe mamíferos.

            Polimorfismo - Polimorfismo é o princípio pelo qual duas ou mais classes derivadas de uma mesma superclasse 
                           podem invocar métodos que têm a mesma identificação (assinatura) mas comportamentos distintos, 
                           especializados para cada classe derivada, usando para tanto uma referência a um objeto do tipo 
                           da superclasse
            
            Exemplo:
                Temos o método calcularArea(), e esse calcularArea() funciona para as classes Elipse e Círculo.
        
            Abstração - Abstração em programação OO significa "esconder" partes da implementação do objeto expondo apenas 
                        a sua interface. Significa ignorar detalhes que não são imprescindíveis e apenas lidar com o que 
                        é importante

        */
    }
    
    private static void associacao(){
        /*
            
            Associacao entre duas classes indica relacionamentos estruturais
                Composição - um para muitos, parte não têm existência independente do todo 
                             ela é representada no lado menor com um losango escuro
                Agregação - um para muitos, parte têm existência independente do todo
                             ela é representada no lado menor com um losango branco
        
        */
    }    
    
    private static void comparacaoObjetos(){
        /*
                As variáveis de instância receberão valor diferente de null somente após sua instanciação
                    Exemplo:    
                        joao = new Pessoa(“João”); // joao -> 721ab#23
                        
                        p1 Endereco != p2 Endereco - mesmo sendo o mesmo sendo o mesmo valor, os dois possuem instanciação 
                        diferente.
                        Mas, se fizer...
                            p1 = p2;
                        Assim, os dois iram se igualar, ficando com o mesmo código de instanciação
        
                Precisamos usar métodos para comparar o estado interno dos objetos, já que estamos falando de igualdade 
                em relação aos valores dos atributos!
        
                public boolean equals(Object x);
        */
    }

    private static void chamar() {

        pilaresOO();
        associacao();
        comparacaoObjetos();
    }

    public static void main(String[] args) {
        
        System.out.println();
    }
}
