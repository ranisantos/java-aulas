package aula_java_III.praticaIntregadora2.exercicio1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Garagem {
    private int id;
    private List<Veiculo> veiculos;

    public Garagem(int id, List<Veiculo> veiculos) {
        this.id = id;
        this.veiculos = veiculos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void listaOrdenadaPorPreco(){
        veiculos.stream().sorted(Comparator.comparingDouble(Veiculo::getPreco)).forEach(System.out::println);
    }

    public void listaOrdenadaPorMarca(){
        veiculos.stream().sorted(Comparator.comparing(Veiculo::getMarca)).forEach(System.out::println);
    }

    public void listaPrecoMenosQ1000(){
        veiculos.stream().filter(veiculo -> veiculo.getPreco() < 1000).forEach(System.out::println);
    }

    public void listaPrecoMaiorQ1000(){
        veiculos.stream().filter(veiculo -> veiculo.getPreco() > 1000).forEach(System.out::println);
    }

    public void mediaPrecos(){
        System.out.println(veiculos.stream().mapToDouble(Veiculo::getPreco).average());
    }

    @Override
    public String toString() {
        return "Garagem - Id=" + id + " Veiculos=" + veiculos.toString();
    }
}
