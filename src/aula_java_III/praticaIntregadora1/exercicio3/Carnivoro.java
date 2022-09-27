package aula_java_III.praticaIntregadora1.exercicio3;

public interface Carnivoro {
    default  void comerCarne(String nome){
        System.out.println(nome + " esta comendo carne");
    }
}
