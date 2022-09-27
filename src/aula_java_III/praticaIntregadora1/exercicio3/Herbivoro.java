package aula_java_III.praticaIntregadora1.exercicio3;

public interface Herbivoro {
    default void comerPasto(String nome){
        System.out.println(nome + " esta pastando");
    }
}
