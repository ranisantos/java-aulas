package aula_java_V;

import java.util.*;

public class Corrida {
    private float distancia;
    private  float premioDolares;
    private String nome;
    private int numVeiculosPermitidos;
    private List<Veiculo> veiculos;

    public Corrida(float distancia, float premioDolares, String nome, int numVeiculosPermitidos, List<Veiculo> veiculos) {
        this.distancia = distancia;
        this.premioDolares = premioDolares;
        this.nome = nome;
        this.numVeiculosPermitidos = numVeiculosPermitidos;
        this.veiculos = veiculos;
    }

    public Corrida(float distancia, float premioDolares, String nome, int numVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioDolares = premioDolares;
        this.nome = nome;
        this.numVeiculosPermitidos = numVeiculosPermitidos;
        this.veiculos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Corrida - Nome=" + nome +
                " Distancia=" + distancia +
                " Premio=" + premioDolares + " USD" +
                ", Numero Max. de Veiculos=" + numVeiculosPermitidos +
                " Veiculos=" + veiculos;
    }

    public void addCarro(int velocidade, float aceleracao, float anguloGiro, String placa){
        if (veiculos.size() < numVeiculosPermitidos)
            veiculos.add(new Carro(velocidade, aceleracao, anguloGiro, placa));
        else
            System.out.println("Numero máximo de veiculos atingido");
    }

    public void addMoto(int velocidade, float aceleracao, float anguloGiro, String placa){
        if (veiculos.size() < numVeiculosPermitidos)
            veiculos.add(new Moto(velocidade, aceleracao, anguloGiro, placa));
        else
            System.out.println("Numero máximo de veiculos atingido");
    }

    public void deleteVeiculo(Veiculo veiculo){
        if (veiculos.remove(veiculo))
            System.out.println("Veiculo deletado com sucesso!");
        else
            System.out.println("Veiculo não encontrado!");
    }

    public void deleteVeiculoComPlaca(String placa){
        Optional<Veiculo> cltProcurado = veiculos.stream().filter(c -> c.getPlaca().equals(placa)).findFirst();
        cltProcurado.ifPresentOrElse((value) -> {
            veiculos.remove(value);
            System.out.println("Veiculo excluido com sucesso!");
        }, () -> {
            System.out.println("Placa não encontrada!!\n");
        });
    }

    public void definirCampeao(){
        Veiculo vencedor = null;
        if(!veiculos.isEmpty()) {
            double melhorDesempenho=0;
            for (Veiculo veiculo : veiculos) {
                if(melhorDesempenho< calcularDesempenho(veiculo)){
                    melhorDesempenho= calcularDesempenho(veiculo);
                    vencedor=veiculo;
                }
            }
        }
        System.out.println("VENCEDOR " + vencedor.toString());
    }

    public double calcularDesempenho(Veiculo veiculo){
        return veiculo.getVelocidade() * 1 / 2 * veiculo.getAceleracao() /(veiculo.getAnguloDeGiro() * (veiculo.getPeso() - veiculo.getRodas() * 100));
    }

    public void mandarSocorrista(Socorrista socorrista, Veiculo veiculo){
        socorrista.socorrer(veiculo);
    }
}
