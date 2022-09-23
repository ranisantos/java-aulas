package praticaIntegrada2;

public class Participante extends  Pessoa{
    private int circuito;
    private int valorIncricao;

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
        System.out.println("Valor da inscrição: " + getValorIncricao());
    }

    public void exibirNumeroNome(int index) {
        System.out.println("Participante " + getNome() + " Numero: " + index);
    }

    public int getCircuito() {
        return circuito;
    }

    public void setCircuito(int circuito) {
        this.circuito = circuito;
    }

    public int getValorIncricao() {
        return valorIncricao;
    }

    public void setValorIncricao() {
        if (getCircuito() == 1 && getIdade() < 18){
            this.valorIncricao = 1300;
        }
        else if(getCircuito() == 1 && getIdade() >= 18){
            this.valorIncricao = 1500;
        }
        else if (getCircuito() == 2 && getIdade() < 18){
            this.valorIncricao = 2000;
        }
        else if(getCircuito() == 2 && getIdade() >= 18){
            this.valorIncricao = 2300;
        }
        else {
            this.valorIncricao = 2800;
        }
    }
}
