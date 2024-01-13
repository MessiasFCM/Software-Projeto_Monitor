package Materia;
/**
 * Essa Class é uma explicação do Básico do Java, feito por @MessiasFCM
 */
public class Basico {
    
    private static void imports() {
        /*
                POSSUI EXEMPLOS NA PASTA EXEMPLOS
        
            import java.util.Scanner;                                           // Import Teclado
                Scanner teclado = new Scanner(System.in);
                String nome = teclado.nextLine();                               // Ler uma String
                String nome = teclado.nextInt();                                // Ler uma Inteiro
                teclado.close();
                
            import java.util.Random;                                            // Import Número Aleatório
                random rand = new Random();
                int x = rand.nextInt(100);
        
            import java.text.DecimalFormat;                                     // Import Arredondamento de Números
                double num = 5355.47547;
                DecimalFormat df;
                df = new DecimalFormat("#.##");

                System.out.println(df.format(num));
                
            import java.util.Arrays;                                            // Import Coloca um Vetor em Ordem Crescente
                int v[] = new int[5];
                v[0] = 21;
                v[1] = 1453;
                v[2] = 152;
                v[3] = 01;
                v[4] = 1423;
                Arrays.sort(v);
                System.out.println(v[0]);
                
                
            Math
                int s = (int) Math.pow(a, b);                                   // Exponencial
                int s = Math.max(x,y);                                          // Maior Número
                int s = Math.min(x,y);                                          // Menor Número
        
            System.out.println(“Exemplo“);
        
            
            import javax.swing.JOptionPane;
                JOptionPane.showConfirmDialog( )                                // Faz uma pergunta ao usuário. 
                            .showConfirmDialog(Component parentComponent, Object message,String title, int optionType, int messageType) 
                JOptionPane.showInputDialog( )                                  // Requisita uma entrada. 
                           .showInputDialog(Component parentComponent, Object message,String title, int messageType, Icon icon, Object[ ] valoreSelecionáveis, Object valorInicial) 
                JOptionPane.showMessageDialog( )                                // Mostra uma mensagem. 
                           .showMessageDialog(Component parentComponent, Object message,String title, int messageType) 
                JOptionPane.showOptionDialog( )                                 // Unificação dos 3 acima. 
                            .showOptionDialog(Component    parentComponent, Object message, String title, int optionType, int messageType, Icon icon, Object[ ] options,Object initialValue)
        
                *   Component parentComponent – Componente sobre qual o dialogo será criado
                *   Object message – A mensagem que será mostrada na tela. Normalmente é uma String, porém a mensagem será mostrada conforme seu tipo:
                        Component – O componente será mostrado conforme seu padrão.
                        Icon – Será mostrado a figura na tela como seu padrão.
                        Outros – O objeto será transformado em String conforme seu método 
                        Object.toString();
                *   Icon icon – Ícone mostrado no diálogo.
                *   String title – O titulo do diálogo, será mostrado na barra de titulo.
                *   Int messageType – Define o tipo da mensagem – ícone do diálogo:
                        JOptionPane.ERROR_MESSAGE             0.
                        JOptionPane.INFORMATION_MESSAGE       1.
                        JOptionPane.WARNING_MESSGE            2.
                        JOptionPane.QUESTION_MESSAGE          3.
                        JOptionPane.PLAIN_MESSAGE            ­1.
                *   Int optionType – Define os botões de resposta do diálogo, pode ser:
                        JOptionPane.YES_NO_OPTION             0.
                        JOptionPane.YES_NO_CANCEL_OPTION      1.

                *   Object[ ] options – Vetor com os botões do diálogo
                *   Object initialValue – Botão previamente selecionado.

         */
    }

    private static void variaveis() {
        /* 
        
            Textos
                String aT = "teste";   ∞ Caracteres
                char bT = 't';         1 Caracter apenas

            Logicos
                boolean aL = true;    True or False

            Inteiros 
                byte aI = 0;          Menores que 127
                short bI = 5;         Menores que 10.000
                int cI = 10;          Menores que 1.000.000.000
                long dI = 15;         Muito Grandes...

            Reais
                float aR = 0.0;       Umas 50 Casas Decimais
                Double bR = 5.0;      Umas 340 Casas Decimais

            Final - O valor de uma constante não mudará durante a execução do programa
                final float pi = 3.1415;
                
        
            De String para Inteiro
                Inteiro = Integer.parseInt(texto);
        
            De Inteiro para String
                texto = Integer.toString(Inteiro);
        
         */
    }

    private static void stringMetodos() {
        /*    
        
            equals(<String>)                            // Compara os Textos
            equalsIgnoreCase(<String>)                  // Compara os Textos e Ignora Letras Maiúsculas
            int length()                                // Retorna o Tamanho da String
            int indexOf(String s)                       // Procura s na String e Retorna a Posição, Retorna -1 se Não Achou
            char charAt(int i)                          // Retorna o Caracter na Posição i da String (Começa de 0)
            String[] x = y.split(" ")                   // Separar o Texto em Espacos
            x.startsWith("oi")                          // Ira verificar se oi é a primeira palavra da string e dará um valor boolean
            x.endsWith("fim")                           // Ira verificar se fim é a ultima palavra da string e dará um valor boolean
            X.trim()                                    // Retira os espaços em branco antes do texto digitado 
            substring(n1,n2)                            // Retira uma Parte da String, de uma Posição até a Outra Posição
            System.out.printf("%s %d", nome, idade)     // Ultiliza os %s para substituir String, %d para Inteiros e %f para Double.
            System.out.println("");                     // Exibir Texto
            String x =  Y > Z ? "S" : "N";              // String Condicional
        
        Exemplos
        
            for(int i=0; i >= y.length; i++){         // Ultilizando o lenght
                y2[i]=y[y.length-i];   
            }  
        
            System.out.println("thiago correa".indexOf("a"));       // a na Posição 3
            System.out.println("thiago correa".indexOf("a", 5));    // a na Posição 12   
        
            for(int i = str.length()-1; i >= 0;i--){
                strFim[j] = str.charAt(i);
                j++;
            }
        
            String alunoRecebido = "Messias Joao Peixoto";
            String[] textoSeparado = alunoRecebido.split(" ");

            System.out.println(textoSeparado[1]);
        
            int idade = 84;
            double ganho = 1_223.764;
            String nome = "Messias";
            String sobrenome = "Feres";
            System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f. \n", nome, sobrenome,idade, ganho);
        
            String resultado = media >= 7.0 ? "Aprovado" : "Reprovado"; - String Condicional
         */
    }

    private static void vetorMatriz() {
        /*
            
            Declarar Vetor
                int aV[];
            Reserva de espaço na memória e definição do tamanho
                aV = new int[4];
            Armazenamento dos elementos
                aV[2] = 3; ou
                aV[2] = teclado.nextInt();  
        
            Declarar Matriz
                int aM[][];
            Reserva de espaço na memória e definição do tamanho
                aM = new int[4][];
            Armazenamento dos elementos
                aM[2][0] = 3; ou
                aM[2][0] = teclado.nextInt(); 
        
         */
    }

    private static void operadores() {
        /*
        
            ==  !=  <  <=  >=  > 
        
            +  Soma
            -  Subtração
            *  Multiplicação
            /  Divisão
            %  Resto da Divisão
        
            +=  -=  *=  /=  &=
        
            --a   Subtrai 1 da Variável a e Depois Calcula a Expressão na Qual a Reside.
            a--   Calcula a Expressão na Qual a Reside e Depois Subtrai 1 da Variável a.
            ++b   Adiciona 1 da Variável b e Depois Calcula a Expressão na Qual b Reside.
            b++   Calcula a Expressão na Qual b Reside e Depois Adciona 1 da Variável b.
        
            Ordem de Prioridade v
            &&   Multiplicação                  1 && 0   Desaprovado
            ||   Adição                         1 || 0   Aprovado         
            ^    Exclusivo                       V ^ V   False                  // F ^ F = F, F ^ V = V, V ^ F = V
            !    Inverter                       !1       Desaprovado
        
         */
    }

    private static void repeticoes() {
        /*
        
            int a = 2, b = 3;
            
            If(Se) - Condição, por exemplo, se a for maior que b, a condição se satisfaz, se não for vai para o else
        
                if(a > b){
                }else{    
                } 

                // --------------------------
                
                if(a > b){   
                }else if(a < b){
                }
        
            // ------------------------------
            
            For(Para) - Repetição até que a condição se complete, encerrando o for.
        
                for (int i = 0; i < 10; i++) {
                }
                
            // ------------------------------
            
            While(Enquanto) - Repetição que continua enquanto uma condição estiver ativa
        
                while (a < 5) {            
                    System.out.println("a");
                    a++;
                }
                
                // --------------------------
            
            Do While - Repete uma vez, e continua a repetição se determinada condição estive ativa
        
                do{
                    System.out.println("a"); 
                    a++;
                }while (a < 4);
                
            // ------------------------------
                
            Switch(Escolha) - Determine um número e um caso, ao se ter o número leva direto ao caso determinado.
        
                switch(a){
                    case 1:
                            System.out.println("1");
                            break;
                    case 2:
                            System.out.println("2");
                            break;
                    case 3:
                            System.out.println("3");
                            break;
                    default:
                            System.out.println("0");
                }
                
            // ------------------------------
            
            forEach utilizado para se ler os valores de um array(vetor, matriz...)
        
            for(Aluno a: lista){             // sendo lista o vetor com os dados dos alunos
                System.out.println(a)     
            }
        
         */
    }

    private static void funcaoMatriz() {
        
        
            /*Função
                private static <tipo> nomeDaFunção (<tipo> agr1, <tipo> arg2, ..., <tipo> argN){

                    <corpo da função>
                                
                    return valorDeRetorno;      
                }
            
                private static int soma(int x, int y){

                    int s = x + y;
                    return s;
                }
            
             Procedimentos
                private static void nomeDoProcedimento (<tipo> parametro1, <tipo> parametro2, ..., <tipo> parametroN){

                    <corpo do procedimento>

                }
            
                private static void imprimeDobro(int x){

                    System.out.println("Dobro de " + x + " é " + x*2);
                    
                }    
        
             Chamar os dois
                int resultado = soma(x,y);
                imprimeDobro(x);
            */    
         
    }

    private static void caractersEspecias() {
        
           
            System.out.println("Exemplo 1" + " Hello\nWorld " + "Exemplo 2");       // Pula uma linha
            System.out.println("Exemplo 1" + " Hello\bWorld " + "Exemplo 2");       // Apaga o ultimo caracter
            System.out.println("Exemplo 1" + " Hello\rWorld " + "Exemplo 2");       // Retorno de carro
            System.out.println("Exemplo 1" + " Hello\tWorld " + "Exemplo 2");       // Tabulação ?
            System.out.println("Exemplo 1" + " Hello\'World " + "Exemplo 2");       // Apostrofe
            System.out.println("Exemplo 1" + " Hello\"World " + "Exemplo 2");       // Aspas
            System.out.println("Exemplo 1" + " Hello\\World " + "Exemplo 2");       // Barra invertida
            System.out.println("Exemplo 1" + " Hello\u223dWorld " + "Exemplo 2");   // Caracter unicode
            System.out.println("Exemplo 1" + " Hello\fWorld " + "Exemplo 2");       // Caracter quadrado
        
         
    }

    private static void chamar() {
        imports();
        variaveis();
        stringMetodos();
        vetorMatriz();
        operadores();
        repeticoes();
        funcaoMatriz();
        caractersEspecias();
    }

    public static void main(String[] args) {
 
        System.out.println();
    }
}
