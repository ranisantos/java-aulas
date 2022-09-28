package aula_java_IV;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MenuService {
    Scanner scanner = new Scanner(System.in);
    int iDControler = 1;
    List<Cliente> clientes = new ArrayList<>();

    public void mostrarMenu(){
        System.out.println("\n-----Menu-----");
        System.out.println("1. Cadastrar \n2. Listar \n3. Buscar \n4. Excluir \n5. Encerrar \nEscolha o Numero:");
    }

    public void cadastrar(){
        Cliente clt = new Cliente();
        System.out.println("\nDigite o nome do cliente:");
        clt.setNome(scanner.nextLine());
        System.out.println("Digite o sobrenome do cliente:");
        clt.setSobrenome(scanner.nextLine());
        clt.setID(iDControler);
        iDControler++;

        clientes.add(clt);
        System.out.println("CLIENTE CADASTRADO!");
    }

    public void listar(){
        System.out.println("--------------Clientes--------------");
        clientes.forEach(System.out::println);
        System.out.println("------------------------------------");
    }

    public void buscar(int idBuscado){
        Optional<Cliente> cltProcurado = clientes.stream().filter(c -> c.getID() == idBuscado).findFirst();
        cltProcurado.ifPresentOrElse(
                (value)
                        -> { System.out.println(value); },
                ()
                        -> { System.out.println("ID não encontrado!!\n"); });
    }

    public void excluir(int idDelete){
        Optional<Cliente> cltProcurado = clientes.stream().filter(c -> c.getID() == idDelete).findFirst();
        cltProcurado.ifPresentOrElse((value) -> {
                    clientes.remove(value);
                    System.out.println("Cliente excluido com sucesso!");
                }, () -> {
                    System.out.println("ID não encontrado!!\n");
        });
    }
}
