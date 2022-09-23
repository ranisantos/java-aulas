package aula_java_II.praticaIntegradora1;

public class Pessoa {
    private String nome;
    private int idade;
    private String ID;
    private float peso;
    private float altura;

    public Pessoa(String nome, int idade, String ID, float peso, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoa(String nome, int idade, String ID) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }

    public Pessoa(){ }

    public int calcularIMC(){
        double result = this.peso / (Math.pow(this.altura, 2));
        if (result < 20)
            return -1;
        else if (result >= 20 && result <= 25)
            return 0;
        else
            return 1;
    }

    public boolean ehMaiorIdade(){
        return this.idade >= 18;
    }

    @Override
    public String toString(){
        String maioridade = ehMaiorIdade() ? "É maior de idade": "É menor de idade";
        String imc = calcularIMC() == -1 ? "Abaixo do peso" : (calcularIMC() == 0 ? "Peso Saudavel" : "Sobrepeso");
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nPeso: " + getPeso() + "\nAltura: " + getAltura() + "\n" + maioridade + "\n" + imc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
