package aula_java_III.praticaIntregadora1.exercicio2;

public class Habilidade {
    private String nome;

    public Habilidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
