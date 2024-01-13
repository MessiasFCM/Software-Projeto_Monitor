package Exemplos.OO_Biblioteca;

import java.util.ArrayList;

public class Livro {
   private String isbn, titulo, autor, editora;
   private ArrayList<Exemplar> exemplares;
   
   public Livro(String isbn, String tit, 
           String aut, String edi){
       this.exemplares = new ArrayList<>();
       this.titulo = tit;
       this.autor = aut;
       this.editora = edi;
   }
   
   public boolean equals(Object outroLivro){
	   Livro outro = (Livro) outroLivro;
	   if (this.isbn.equals(outro.isbn)) 
	        return true;
	   else
		return false;
   }
   
   public String toString(){
        String itens = "";
        for(Exemplar e: this.exemplares)
             itens+= e.toString() + "\n";
        return "Titulo: "+ this.titulo + " Autor: "+
                this.autor + " Editora: " + this.editora
                + "\n" + itens+"\n";
   }
   
   public String getTitulo(){
	    return this.titulo;
   }
   
   public void addExemplar(Exemplar e){
       this.exemplares.add(e);
   }
   
   public void imprimeExemplares(){
        for(Exemplar e: this.exemplares)
             System.out.println(e+"\n");
   }
   
   public int getTotalExemplares(){
       return this.exemplares.size();
   }
   
   public int getTotalExemplaresDisponiveis(){
        int conta = 0;
        for(Exemplar e: this.exemplares)
             if (e.getStatus() == Exemplar.DISP)
                 conta++;
        return conta;
   }
   
   public Exemplar getUmExemplarDisponivel(Livro l){
        for(Exemplar e: this.exemplares)
             if (e.getStatus() == Exemplar.DISP)
                 return e;
        return null;
   }
   
   //A devolução de exemplar muda o status de EMPR para DISP
   public boolean devolveExemplar(){
        for(Exemplar e: this.exemplares)
             if (e.getStatus() == Exemplar.EMPR){
                 e.setStatus(Exemplar.DISP);
                 return true;
             }    
        return false; //situação de erro pois não há
                      //exemplar emprestado para o livro l
   }
   
   //Excluir Exemplares
   public void excluirExemplares(){
       this.exemplares = null;
   }
   
}
