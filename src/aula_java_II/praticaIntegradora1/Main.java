package aula_java_II.praticaIntegradora1;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Raniel", 27, "001");
        Pessoa pessoa3 = new Pessoa("Marina", 23, "002", 74.5f, 1.81f);
        // Pessoa pessoa4 = new Pessoa("Hiro"); não é possível, pois nao foi criado construtor para este caso
        System.out.println(pessoa3.toString());
    }
}
