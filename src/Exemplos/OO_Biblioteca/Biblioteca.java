package Exemplos.OO_Biblioteca;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Biblioteca {
    private String nomeProprietario;
    private ArrayList<Livro> acervo;
    
    public Biblioteca(String nome){
    	this.nomeProprietario = nome;
    	this.acervo = new ArrayList<Livro>();
    }
    
    public boolean fazerEmprestimo(Livro l){
        Exemplar exemplar = l.getUmExemplarDisponivel(l);
        if (exemplar == null)  // o livro l não tem nenhum exemplar disponível
            return false;
        else{
            exemplar.setStatus(Exemplar.EMPR);
            return true;
        }    
    }
    
    public boolean fazerDevolucao(Livro l){
        return l.devolveExemplar();
    }
    
    public void addLivroAoAcervo(Livro livro){
    	this.acervo.add(livro);
    }    

    public boolean removeLivro(String titulo){
       	 for(Livro l: this.acervo){
       		 if (l.getTitulo().equalsIgnoreCase(titulo))
       			 return this.acervo.remove(l);
       	 }
         return false;
    }
       
    public boolean removeLivro(Livro l){
    	return this.acervo.remove(l);
    }
    
           
    public void imprimeAcervo(){
    	String sB= "";
    	Livro l;
    	for(int i=0; i < this.acervo.size(); i++){
    		l = this.acervo.get(i);
    		sB+= l + "\n";
    	}
    	JOptionPane.showMessageDialog(null, sB);
    }
    
    public Livro pesquisa(String titulo){
       	 for(Livro l: this.acervo){
       		 if (l.getTitulo().equalsIgnoreCase(titulo))
       			 return l;
       	 }
         return null;
    }
}






















