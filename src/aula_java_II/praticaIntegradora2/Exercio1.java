package aula_java_II.praticaIntegradora2;

public class Exercio1 {
    public static int Divisao(int a, int b){
        if(a == 0)
            throw new IllegalArgumentException("Nao pode ser dividido por zero");
        return b/a;
    }

    public static void main(String[] args) {
        int a = 0, b = 300;

        System.out.println("Teste divisao: " + Divisao(a, b));

    }
}
