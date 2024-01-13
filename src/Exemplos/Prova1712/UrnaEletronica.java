package Exemplos.Prova1712;
import java.util.*;

public class UrnaEletronica {
    private ArrayList<Candidato> candidatos;
    
    public UrnaEletronica(){
        this.candidatos = new ArrayList<Candidato>();
    }
    
    //Adiciona um candidato à urna
    public void addCandidato(Candidato it){
        this.candidatos.add(it);
    }
    
    //Busca por um candidato com número
    //igual ao parâmetro 'num'
    //Se encontrar adiciona um voto ao mesmo.
    //Senão encontrar o método não realiza ação.
    public void votar(int num){
         for(Candidato it: this.candidatos) 
             if (it.getNumero() == num)
                 it.adicionaVoto();
    } 
     
    //Imprime relatório da urna
    public void relatorioUrna(){
        for(Candidato it: this.candidatos) 
             System.out.println(it);
                
    }
    
    //Adicione aqui o código da aplicação: 
    public static void main(String[] args) {
        Candidato candidato1 = new Candidato("First", 14);
        Candidato candidato2 = new Candidato("Second", 72);
        UrnaEletronica urna = new UrnaEletronica();
        
        Scanner teclado = new Scanner(System.in);
        
        urna.addCandidato(candidato1);
        urna.addCandidato(candidato2);
        
        int cont;
        int voto;
        do{
            cont = teclado.nextInt();
            if(cont==1){
                voto = teclado.nextInt();
                urna.votar(voto);
            }
        }while(cont!=2);
   
        urna.relatorioUrna();
        teclado.close();
    }
}
