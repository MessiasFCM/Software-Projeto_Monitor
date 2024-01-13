package Exemplos.OO_UrnaEletronica;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class UrnaEletronica {
    
    int codigoMaquina, zona, secao;
    long totalVotos;
    String descricaoEleicao;
    boolean votacaoEncerrada;
    ArrayList<Candidato> candidatos;
    public static UrnaEletronica u1 = new UrnaEletronica("Urna1", 230, 1, 1);
    public static Candidato c1 = new Candidato(13, "Deputado", "João");
    public static Candidato c2 = new Candidato(17, "Deputado", "Julia");
    public static Candidato c3 = new Candidato(21, "Vereador", "Jamilton");
    
    public UrnaEletronica(String descricao, int codigoMaquina, int zona, int secao){
        this.descricaoEleicao = descricao;
        this.codigoMaquina = codigoMaquina;
        this.zona = zona;
        this.secao = secao;
        this.candidatos = new ArrayList<Candidato>();
        this.votacaoEncerrada = false;
    }
    
    public boolean addCandidato(Candidato c){
       
        for(Candidato n : candidatos){
            if(n == c){
                return false;
            }
        }
        candidatos.add(c);
        return true;
    }
    
    public boolean removeCandidato(Candidato c){
       
        for(Candidato n : candidatos){
            if(n == c){
                candidatos.remove(c);
                return true;
            }
        }
        return false;
    }
    
    public void imprimeCandidatos(){
        for(Candidato n: candidatos){
            System.out.println(n.toString());
        }
    }
    
    public boolean votar(int numCandidato){
        for(Candidato n: candidatos){
            if(n.numCandidato == numCandidato){
                n.adicionarVoto();
                return true;
            }
        }
        return false; 
    }
    
    public void setVotacaoEncerrada(boolean valot){
        votacaoEncerrada = false;
    }
    
    public void imprimeRelatorioFinalUrna(){
        System.out.println("Relatório Final Urna "+codigoMaquina+
                "\nEleição: "+descricaoEleicao+"\nZona: "+zona+" - Seção: "
                +secao+"\n---");
        u1.imprimeCandidatos();
        System.out.print("---\nTotal de votos da máquina: "+totalVotos);
    }
    
    public Candidato retornaCandidatoMaisVotado(String cargo){
        long maiorVoto = 0;
        for(Candidato n: candidatos){
            if(n.getCargo()==cargo){
                if(n.getNumVotos() > maiorVoto){
                    maiorVoto = n.getNumVotos();
                }
            }
        }
        if(maiorVoto > 0){
                for(Candidato n:candidatos){
                    if(n.getNumVotos() == maiorVoto){
                        return n;
                    }
                }
            }
        return null;
    }
    
    public static void main(String[] args) {
     
        // 1
        System.out.println(u1.addCandidato(c1));
        System.out.println(u1.addCandidato(c2));
        System.out.println(u1.addCandidato(c3));
        System.out.println(u1.addCandidato(c1));
        
        // 2
        Scanner t1 = new Scanner(System.in);
        System.out.println("Vortar no: ");
        int x= t1.nextInt();
        u1.votar(x);
        u1.votar(17);
        u1.votar(17);
        u1.votar(17);
        u1.votar(17);
        u1.imprimeCandidatos();
        
        // 3
        System.out.println("Mais Votado: "+ u1.retornaCandidatoMaisVotado("Deputado").nome);
        u1.imprimeRelatorioFinalUrna();
        
        
    }
}
