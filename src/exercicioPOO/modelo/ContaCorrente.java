package exercicioPOO.modelo;

import exercicioPOO.exception.InvalidNumberException;

public class ContaCorrente extends Conta{
    public ContaCorrente(int numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public boolean sacar(double valor) throws InvalidNumberException {
        if(saldoInsuficiente(valor))
            return false; // saldo insuficiente

        return super.sacar(valor);
    }

    private boolean saldoInsuficiente(double valor){
        return  getSaldo() < valor;
    }

    @Override
    public String toString() {
        return "Conta Corrente: " + super.toString();
    }
}
