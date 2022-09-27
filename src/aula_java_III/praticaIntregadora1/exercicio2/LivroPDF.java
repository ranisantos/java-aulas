package aula_java_III.praticaIntregadora1.exercicio2;

public class LivroPDF extends Documento{

    private String titulo;
    private String autor;
    private int numPaginas;
    private String genero;

    public LivroPDF(String titulo, String autor, int numPaginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + " Autor: " + autor + " Genero: " + genero + " Paginas: " + numPaginas;
    }

    @Override
    public void imprimir(Mostrar show) {
        show.exibir(toString());
    }
}
