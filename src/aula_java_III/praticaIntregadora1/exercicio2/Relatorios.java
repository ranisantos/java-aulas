package aula_java_III.praticaIntregadora1.exercicio2;

public class Relatorios extends  Documento{
    private String texto;
    private String autor;
    private int NumPaginas;
    private String revisor;

    public Relatorios(String texto, String autor, int numPaginas, String revisor) {
        this.texto = texto;
        this.autor = autor;
        NumPaginas = numPaginas;
        this.revisor = revisor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        NumPaginas = numPaginas;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    @Override
    public String toString() {
        return "texto='" + texto + '\'' +
                ", autor='" + autor + '\'' +
                ", NumPaginas=" + NumPaginas +
                ", revisor='" + revisor;
    }

    @Override
    public void imprimir(Mostrar show) {
        show.exibir(toString());
    }
}
