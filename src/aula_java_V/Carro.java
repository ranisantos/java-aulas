package aula_java_V;

public class Carro extends Veiculo{
    public Carro(int velocidade, float aceleracao, float anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, 1000, 4);
    }
}
