package aula_java_I.praticaIntegrada2;

import java.util.*;

public class Main {
    public static int SelecionarCircuito(int idade) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Selecione o circuito: ");
        System.out.println("1 - Pequeno");
        System.out.println("2 - Médio");
        System.out.println("3 - Avançado");

        int categoriaCircuito = keyboard.nextInt();

        if(categoriaCircuito == 3 && idade < 18){
            System.out.println("Menores de 18 anos não podem se inscrever na categoria avançada! \n Escolha outra categoria ou cancele o cadastro.");
            System.out.println("Selecione o circuito: ");
            System.out.println("1 - Pequeno");
            System.out.println("2 - Médio");
            System.out.println("3 - Avançado");
            System.out.println("4 - Cancelar");

            categoriaCircuito = keyboard.nextInt();
        }

        return categoriaCircuito;
    }

    public static void main(String[] args) {
        HashMap<Integer,Participante> listaParticipantes = new HashMap<>();
        Scanner keyboard = new Scanner(System.in);
        int number = 1;
        int option;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Cancelar");
            System.out.println("4 - Sair");
            option = keyboard.nextInt();

            switch (option){
                case 1:
                    Participante part = new Participante();
                    System.out.println("Insira os dados do participante");
                    System.out.print("Nome: ");
                    part.setNome(keyboard.next());
                    System.out.println("");
                    System.out.print("Sobrenome: ");
                    part.setSobrenome(keyboard.next());
                    System.out.println("");
                    System.out.print("RG: ");
                    part.setRg(keyboard.next());
                    System.out.println("");
                    System.out.print("Idade: ");
                    part.setIdade(keyboard.nextInt());
                    System.out.println("");
                    System.out.print("Celular: ");
                    part.setCelular(keyboard.next());
                    System.out.println("");
                    System.out.print("Celular de emergência: ");
                    part.setCelEmergencia(keyboard.next());
                    System.out.println("");
                    System.out.print("Tipo Sanguineo: ");
                    part.setTipoSanguineo(keyboard.next());
                    System.out.println("");

                    int circuito = SelecionarCircuito(part.getIdade());
                    if (circuito == 4){
                        break;
                    }
                    else {
                        part.setCircuito(circuito);
                    }

                    part.setValorIncricao();

                    listaParticipantes.put(number,part);
                    number++;
                    break;
                case 2:
                    System.out.println("Selecione a Categoria do circuito: ");
                    System.out.println("1 - Pequeno");
                    System.out.println("2 - Médio");
                    System.out.println("3 - Avançado");
                    int categoriaCircuito = keyboard.nextInt();

                    for (Map.Entry<Integer, Participante> participante: listaParticipantes.entrySet()){
                        if (participante.getValue().getCircuito() == categoriaCircuito) {
                            participante.getValue().exibir(participante.getKey());
                            System.out.println("-------------------------------------------------------------");
                        }
                    }
                    break;
                case 3:
                    for (Map.Entry<Integer, Participante> participante: listaParticipantes.entrySet()){
                            participante.getValue().exibirNumeroNome(participante.getKey());
                            System.out.println("-------------------------------------------------------------");
                    }
                    System.out.printf("Digite o numero do participante: ");
                    listaParticipantes.remove(keyboard.nextInt());
                    break;
            }

        }while (option != 4);
    }
}
