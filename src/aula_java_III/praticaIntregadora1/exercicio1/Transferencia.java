package aula_java_III.praticaIntregadora1.exercicio1;

public class Transferencia implements Transacoes{
    @Override
    public void transacaoOK() {
        System.out.println("Transferencia ok");
    }

    @Override
    public void transacaoNaoOK() {
        System.out.println("Transferencia não ok");
    }
}