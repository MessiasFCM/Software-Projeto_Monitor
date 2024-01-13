package Materia;
/**
 *  Collections -> Set, List, Queue, Stack, Map
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
    
    private static void Set()   {
        
        // Pode ser Heterogêneo, mas não é o ideal
        // Pode ser Homogêneo, forma correta de se usar o set
        // Não aceita objetos duplicados, se tiver ele apenas o ignora e não adiciona
        // Pode ser ordenado ou desordenado
        // Não é indexado
        
        System.out.println("Ordem desordenada:");
        Set<String> listaAprovados = new HashSet<String>(); // A ordem a ser exibida pode vir fora de ordem
        listaAprovados.add("Ana");
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");
        
        System.out.println("Número de candidatos: " + listaAprovados.size());
        
        for(String candidato: listaAprovados){
            System.out.println(candidato);
        }
        
        System.out.println("\nOrdem ordenada:");
        
        Set<String> listaAprovadosOrdenada = new TreeSet<String>(); // A ordem a ser exibida segue a ordem adicionada 
        listaAprovadosOrdenada.add("Ana");
        listaAprovadosOrdenada.add("Carlos");
        listaAprovadosOrdenada.add("Luca");
        listaAprovadosOrdenada.add("Pedro");
        
        System.out.println("Número de candidatos: " + listaAprovados.size());
        
        for(String candidato: listaAprovadosOrdenada){
            System.out.println(candidato);
        }
        
    }
    
    private static void List()  {
        
        // Pode ser Heterogêneo, mas não é o ideal
        // Pode ser Homogêneo, forma correta de se usar o List
        // Aceita objetos duplicados
        // É ordenado
        // É indexado
        
        /*
            ArrayList<Usuario> lista = new ArrayList<>();

            Usuario u1 = new Usuario("Ana");

            lista.add(u1);
            lista.add(new Usuario("Carlos"));
            lista.add(new Usuario("Lia"));
            lista.add(new Usuario("Bia"));
            lista.add(new Usuario("Manu"));

            System.out.println(lista.get(3));       // Acessar pelo indice (indexado)
        
            System.out.println(lista.remove(1));        // Exibi o nome de quem foi removido
            System.out.println(lista.remove(new Usuario("Manu")));      // Exibi um valor Boolean
            
            System.out.println(lista.contains(new Usuario("Lia")));     // Exibi um valor Boolean
        
            for(Usuario u: lista){
                System.out.println(u.nome);
            }
        */
        
    }
    
    private static void Queue() {
        
        // Primeiro que entrou é o primeiro que sai
        // como exemplo uma fila
        
        Queue<String> fila = new LinkedList<>();
        
        // Offer e Add -> adicionam elementos na fila
        // Diferença é o comportamento quando a fila está cheia!
        fila.add("Ana");    // Retorna false
        fila.offer("Bia");  // Lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");
        
        // Peek e Element -> obter o próximo elementos da fila (sem remover)
        // Diferença é o comportamento quando a fila está vazia!
        System.out.println(fila.peek());        // Retorna false
        System.out.println(fila.element());     // Lança uma exceção

        // Poll e Remove -> obter o próximo elementos da fila e remover
        // Diferença é o comportamento quando a fila está vazia!
        System.out.println(fila.poll());    // Retorna false
        System.out.println(fila.remove());  // Lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        
//        fila.size();
//        fila.clear();
//        fila.isEmpty();
//        fila.contains(...);
    }
    
    private static void Stack() {
        
        // Primeiro que entrou é o último que sai
        // como exemplo uma pilha de livros
        
        Deque<String> livros = new ArrayDeque<String>();
        
        livros.add("O Pequeno Príncipe");   // Retorna false
        livros.push("Dom Quixote");         // Lança uma exceção
        livros.push("O Hobbit");
        
        System.out.println(livros.peek());
        System.out.println(livros.element());
        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
//        System.out.println(livros.remove());

//        livros.size();
//        livros.clear();
//        livros.contains();
//        livros.isEmpty();]
        
    }
    
    private static void Map()   {
        
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(1, "Ricardo");
        usuarios.put(20, "Roberto");
        usuarios.put(3, "Rebeca");
        usuarios.put(4, "Laila");
        
        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        
        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Rebeca"));
        
        System.out.println(usuarios.get(4));
        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.remove(4, "Gui"));
        
        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }
        for(String valor: usuarios.values()){
            System.out.println(valor);
        }
        for(Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + " ==> ");
            System.out.println(registro.getValue());
        }
        
    }
    
    private static void Chamar()    {
        Set();
        List();
        Queue();
        Stack();
        Map();
    }
    
    public static void main(String[] args) {
        
    }
}
