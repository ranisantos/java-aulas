package aula_java_II.praticaIntegradora2;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: "+ nome + "  Preço: " + preco;
    }

    public String getNome() {
        return nome;
    }

    public double calcular(int quantidadeDeProdutos){
        return preco * quantidadeDeProdutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
