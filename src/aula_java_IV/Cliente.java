package aula_java_IV;

public class Cliente {
    private int ID;
    private String nome;
    private String sobrenome;

    public Cliente() { }

    public Cliente(int ID, String nome, String sobrenome) {
        this.ID = ID;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Cliente - ID= " + ID + " Nome= " + nome + " " + sobrenome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
