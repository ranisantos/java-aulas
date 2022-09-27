package aula_java_III.praticaIntregadora1.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Documento doc1 = new Relatorios("Texto legal", "Eu", 10, "Eu");
        Documento doc2 = new LivroPDF("Titulo legal", "Eu", 10, "Aventura");

        List habilidades = new ArrayList<Habilidade>();
        habilidades.add(new Habilidade("Correr"));
        habilidades.add(new Habilidade("Desenhar"));

        Documento doc3 = new Curriculu(new Pessoa("Raniel", 27), habilidades);

        MostrarNaTela mostrar = new MostrarNaTela();

        doc1.imprimir(mostrar);
        doc2.imprimir(mostrar);
        doc3.imprimir(mostrar);
    }
}
