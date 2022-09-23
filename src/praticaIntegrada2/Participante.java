package praticaIntegrada2;

public class Participante {
    //atributos
    private String nome;
    private String sobrenome;
    private String rg;
    private int idade;
    private String celular;
    private String celEmergencia;
    private String tipoSanguineo;
    private int circuito;

    //metodos

    public void exibir(int index) {
        System.out.println("Numero do Participante: " + index);
        System.out.println("Nome: " + getNome());
        System.out.println("Sobrenome: " + getSobrenome());
        System.out.println("RG: " + getRg());
        System.out.println("Idade: " + getIdade());
        System.out.println("Celular: " + getCelular());
        System.out.println("Celular de Emergencia: " + getCelEmergencia());
        System.out.println("Tipo sanguineo: " + getTipoSanguineo());
        if(getCircuito() == 1){
            System.out.println("Circuito Pequeno");
        }
        else if (getCircuito() == 2){
            System.out.println("Circuito Médio");
        }
        else {
            System.out.println("Circuito Avançado");
        }
    }

    public void exibirNumeroNome(int index) {
        System.out.println("Participante " + getNome() + " Numero: " + index);
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCelEmergencia() {
        return celEmergencia;
    }

    public void setCelEmergencia(String celEmergencia) {
        this.celEmergencia = celEmergencia;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getCircuito() {
        return circuito;
    }

    public void setCircuito(int circuito) {
        this.circuito = circuito;
    }
}
