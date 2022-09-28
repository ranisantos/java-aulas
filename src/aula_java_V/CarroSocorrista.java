package aula_java_V;

public class CarroSocorrista implements Socorrista<Carro>{
    public void socorrer(Carro veiculo){
        System.out.println("Socorro carro " + veiculo.getPlaca());
    }

}
