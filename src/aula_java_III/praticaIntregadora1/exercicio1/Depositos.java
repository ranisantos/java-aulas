package aula_java_III.praticaIntregadora1.exercicio1;

public class Depositos implements Transacoes{
    @Override
    public void transacaoOK() {
        System.out.println("Deposito ok");
    }

    @Override
    public void transacaoNaoOK() {
        System.out.println("Deposito não ok");
    }
}
