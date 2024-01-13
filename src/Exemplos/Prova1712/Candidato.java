package Exemplos.Prova1712;

public class Candidato {
    private String nome;
    private int numero;
    private long votos;

    public Candidato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.votos = 0;
    }

    public void adicionaVoto(){
        this.votos++;
    }

    @Override
    public String toString() {
        return "Candidato{" + "nome=" + nome + ", numero=" + numero + ", votos=" + votos + '}';
    }

    public int getNumero() {
        return numero;
    }
}
