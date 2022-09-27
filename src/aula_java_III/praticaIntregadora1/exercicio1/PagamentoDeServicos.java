package aula_java_III.praticaIntregadora1.exercicio1;

public class PagamentoDeServicos implements Transacoes{
    @Override
    public void transacaoOK() {
        System.out.println("Pagamento de Servicos ok");
    }

    @Override
    public void transacaoNaoOK() {
        System.out.println("Pagamento de Servicos não ok");
    }
}