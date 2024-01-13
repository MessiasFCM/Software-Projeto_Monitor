package Exemplos.OO_Biblioteca;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class GerenciaAcervo {
    public static void main (String[] args){
    	Scanner tec = new Scanner(System.in);
    	String nomeAcervo = JOptionPane.showInputDialog(
	    		  "Digite o nome do acervo");
    	 
    	Biblioteca biblio = new Biblioteca(nomeAcervo);
    	int op, status; String isbn, tit, aut, edi, local; Livro livro;
    	do{
    	    String input = JOptionPane.showInputDialog(null, 
    	    		  "Digite a opção: \n1.Cadastrar livro \n2.Cadastra exemplares"
                          + "\n3. Remover livro e todos os seus exemplares"
    	    		  + "\n4.Imprimir acervo \n5. Pesquisar livro +"
                          + "\n6. Fazer empréstimo \n7. Fazer devolução \n8. SAIR");
    	    op = Integer.parseInt(input);
    	    switch(op){
                case 1:
                    isbn = JOptionPane.showInputDialog(null, "Digite o ISBN");
                    tit = JOptionPane.showInputDialog(null, "Digite o titulo");
                    aut = JOptionPane.showInputDialog(null, "Digite o autor");
                    edi = JOptionPane.showInputDialog(null, "Digite a editora");
                    livro = new Livro(isbn,tit, aut, edi);
                    biblio.addLivroAoAcervo(livro);
                    break;
                case 2:
                    tit = JOptionPane.showInputDialog(null, "Digite o titulo do livro para cadastrar exemplar:");
                    livro = biblio.pesquisa(tit);
                    if (livro == null){
                            JOptionPane.showMessageDialog(null, "Livro inexistentes");
                            break; //sai do switch
                    }        
                    local = JOptionPane.showInputDialog(null, "Indique a localização do exemplar");
                    status = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique:\n 1. exemplar para consulta externa "
                                                                            + "ou \n2. exemplar para consulta interna"));
                    switch(status){
                        case Exemplar.DISP:
                        case Exemplar.CONS:
                             livro.addExemplar(new Exemplar(local, status));
                             break;
                        default:
                            JOptionPane.showMessageDialog(null, "Status incorreto");
                            //aqui não haverá cadastro
                    }
                case 3:
                    tit = JOptionPane.showInputDialog(null, "Digite o titulo do livro para remover");
                    livro = biblio.pesquisa(tit);
                    if(livro != null)
                        if (biblio.removeLivro(livro)){
                            livro.excluirExemplares();
                            JOptionPane.showMessageDialog(null, "Livro removido");        
                        }   
                    else
                            JOptionPane.showMessageDialog(null, "Titulo inexistente");
                case 4:
                    biblio.imprimeAcervo();
                    break;
                case 5:
                    tit = JOptionPane.showInputDialog(null, "Digite o titulo do livro para consulta");
                    livro = biblio.pesquisa(tit);
                    if (livro != null){
                        JOptionPane.showMessageDialog(null, livro);  //toString do livro
                    }else
                        JOptionPane.showMessageDialog(null, "Titulo inexistente");
                    break;
                case 6:
                    tit = JOptionPane.showInputDialog(null, "Digite o titulo do livro para emprestimo");
                    livro = biblio.pesquisa(tit);
                    if (livro != null){
                        Exemplar exemplar = livro.getUmExemplarDisponivel(livro);
                        if (exemplar == null){
                            JOptionPane.showMessageDialog(null, "Não há exemplar disponível");
                        }else{
                            exemplar.setStatus(Exemplar.EMPR); //muda status do Exemplar para emprestado
                            JOptionPane.showMessageDialog(null, "Emprestimo concluído");
                        }
                    }else
                        JOptionPane.showMessageDialog(null, "Titulo inexistente");
                    break;
                case 7:
                    tit = JOptionPane.showInputDialog(null, "Digite o titulo do livro para devolução");
                    livro = biblio.pesquisa(tit);
                    if (livro != null){
                        if (biblio.fazerDevolucao(livro))
                            JOptionPane.showMessageDialog(null, "Devolução concluída");
                        else
                             JOptionPane.showMessageDialog(null, "Erro na Devolução!");
                    }else
                         JOptionPane.showMessageDialog(null, "Titulo inexistente");
                    break;
                case 8:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
    	    }
    	}while(op != 8);
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    