package aula_java_III.praticaIntregadora1.exercicio1;

public class ConsultaDeSaldo implements Transacoes{
    @Override
    public void transacaoOK() {
        System.out.println("Consulta de Saldo ok");
    }

    @Override
    public void transacaoNaoOK() {
        System.out.println("Consulta de Saldo não ok");
    }
}