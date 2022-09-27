package aula_java_III.praticaIntregadora1.exercicio1;

public class SaqueEmDinheiro implements Transacoes{
    @Override
    public void transacaoOK() {
        System.out.println("Saque em dinheiro ok");
    }

    @Override
    public void transacaoNaoOK() {
        System.out.println("Saque em dinheiro não ok");
    }
}
