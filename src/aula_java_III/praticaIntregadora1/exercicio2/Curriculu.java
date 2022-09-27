package aula_java_III.praticaIntregadora1.exercicio2;

import java.util.List;

public class Curriculu extends Documento{
    private Pessoa pessoa;
    private List<Habilidade> habilidades;

    public Curriculu(Pessoa pessoa, List<Habilidade> habilidades) {
        this.pessoa = pessoa;
        this.habilidades = habilidades;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Pessoa=" + pessoa.toString() +
                ", Habilidades=" + habilidades.toString();
    }

    @Override
    public void imprimir(Mostrar show) {
        show.exibir(toString());
    }
}
