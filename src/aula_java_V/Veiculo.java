package aula_java_V;

public abstract class Veiculo {
    private int velocidade;
    private float aceleracao;
    private float anguloDeGiro;
    private String placa;
    private float peso;
    private int rodas;

    public Veiculo(int velocidade, float aceleracao, float anguloDeGiro, String placa, float peso, int rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Veiculo - Velocidade=" + velocidade +
                " Aceleracao=" + aceleracao +
                " Angulo de Giro=" + anguloDeGiro +
                " Placa='" + placa +
                " Peso=" + peso +
                " Rodas=" + rodas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public float getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(float aceleracao) {
        this.aceleracao = aceleracao;
    }

    public float getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public void setAnguloDeGiro(float anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
}
