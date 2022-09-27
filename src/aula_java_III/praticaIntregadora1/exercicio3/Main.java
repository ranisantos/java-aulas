package aula_java_III.praticaIntregadora1.exercicio3;

public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        Gato cat = new Gato();
        Vaca cow = new Vaca();

        dog.emitirSom();
        dog.comerCarne("Cachorro");

        cat.emitirSom();
        cat.comerCarne("Gato");

        cow.emitirSom();
        cow.comerPasto("Vaca");
    }
}
