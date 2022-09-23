package aula_java_II.praticaIntegradora2;

public class Pereciveis extends Produto{
    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeDeProdutos){
        if(diasParaVencer == 1)
            return (getPreco() * quantidadeDeProdutos) * 0.25;
        else if(diasParaVencer == 2)
            return (getPreco() * quantidadeDeProdutos) * (1/3);
        else
            return (getPreco() * quantidadeDeProdutos) * 0.5;
    }

    @Override
    public String toString() {
        return "Produto: " + getNome() + "  Preço: " + getPreco() + " Dias Para Vencer= " + diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }
}
