package aula_java_IV;

public class Item {
    private String codigo;
    private String nome;
    private int qtd;
    private double valorUnitario;

    public Item(String codigo, String nome, int qtd, double valorUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtd = qtd;
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "Item - Codigo=" + codigo + " Nome= " + nome + " Quantidade=" + qtd + " Valor Unitario= " + valorUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
