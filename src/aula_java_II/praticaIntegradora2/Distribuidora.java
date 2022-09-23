package aula_java_II.praticaIntegradora2;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {
        List<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new NaoPereciveis("Macarrao", 3.99, "Massa"));
        listaProdutos.add(new NaoPereciveis("Arroz", 12.99, "Grao"));
        listaProdutos.add(new Pereciveis("Chocolate", 5.99, 2));
        listaProdutos.add(new Pereciveis("Leite", 8.50, 1));
        listaProdutos.add(new Pereciveis("Bala", 1.99, 3));

        for (Produto produto: listaProdutos){
            System.out.println(produto.toString() + " Valor Total: " + produto.calcular(5));
        }
    }
}
