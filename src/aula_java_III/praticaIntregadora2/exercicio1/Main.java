package aula_java_III.praticaIntregadora2.exercicio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Veiculo("Fiesta", "Ford", 1000));
        veiculos.add(new Veiculo("Focus", "Ford", 1200));
        veiculos.add(new Veiculo("Explorer", "Ford", 2500));
        veiculos.add(new Veiculo("Uno", "Fiat", 500));
        veiculos.add(new Veiculo("Cronos", "Fiat", 1000));
        veiculos.add(new Veiculo("Torino", "Fiat", 1250));
        veiculos.add(new Veiculo("Aveo", "Chevrolet", 1250));
        veiculos.add(new Veiculo("Spin", "Chevrolet", 2500));
        veiculos.add(new Veiculo("Corola", "Toyota", 1200));
        veiculos.add(new Veiculo("Fortuner", "Toyota", 3000));
        veiculos.add(new Veiculo("Logan", "Renault", 950));

        Garagem garagem = new Garagem(1, veiculos);

        garagem.listaOrdenadaPorMarca();
        System.out.println("-------------------------------------------------");
        garagem.listaOrdenadaPorPreco();
        System.out.println("-------------------------------------------------");
        garagem.listaPrecoMenosQ1000();
        System.out.println("-------------------------------------------------");
        garagem.listaPrecoMaiorQ1000();
        System.out.println("-------------------------------------------------");
        garagem.mediaPrecos();
    }
}
