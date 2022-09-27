package aula_java_III.praticaIntregadora1.exercicio3;

public class Cachorro extends Animal implements Carnivoro{
    @Override
    public void emitirSom() {
        System.out.println("Auau");
    }
}
