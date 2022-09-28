package aula_java_V;

public class Main {
    public static void main(String[] args) {
        Corrida race = new Corrida(2500, 1500, "X Racer", 4);

        Veiculo motoTeste = new Moto(200, 300, 40, "Veloz");
        Veiculo carroTeste = new Carro(300, 350, 40, "Maisveloz");

        race.addCarro(200, 100, 45, "EGX432");
        race.addCarro(198, 100, 50, "EGG422");
        race.addCarro(150, 120, 55, "OVO532");
        race.addCarro(200, 40, 60, "XIX232");

        race.definirCampeao();
        race.deleteVeiculoComPlaca("EGX432");

        CarroSocorrista socorristaCarro = new CarroSocorrista();
        MotoSocorrista socorristaMoto = new MotoSocorrista();

        race.mandarSocorrista(socorristaCarro, carroTeste);
        race.mandarSocorrista(socorristaMoto, motoTeste);
    }
}
