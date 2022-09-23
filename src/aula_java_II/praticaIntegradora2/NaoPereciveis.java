package aula_java_II.praticaIntegradora2;

public class NaoPereciveis extends Produto{
    private String tipo;

    public NaoPereciveis(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Produto: " + getNome() + "  Preço: " + getPreco() + " Tipo: " + tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
