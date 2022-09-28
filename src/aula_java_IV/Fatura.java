package aula_java_IV;

import java.util.List;

public class Fatura {
    private Cliente cliente;
    private double totalFatura;
    private List<Item> itens;

    public Fatura(Cliente cliente, double totalFatura, List<Item> itens) {
        this.cliente = cliente;
        this.totalFatura = totalFatura;
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Fatura - " + '\n' +
                "Cliente= " + cliente +
                "Itens= " + itens.toString() +
                "Total= " + totalFatura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotalFatura() {
        return totalFatura;
    }

    public void setTotalFatura(double totalFatura) {
        this.totalFatura = totalFatura;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
