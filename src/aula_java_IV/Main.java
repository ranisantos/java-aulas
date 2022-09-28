package aula_java_IV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuService menu = new MenuService();
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            menu.mostrarMenu();
            option = scanner.nextInt();

            switch (option){
                case 1:
                    menu.cadastrar();
                break;
                case 2:
                    menu.listar();
                break;
                case 3:
                    System.out.println("\nDigite o ID do cliente que procura:");
                    menu.buscar(scanner.nextInt());
                break;
                case 4:
                    System.out.println("\nDigite o ID do cliente que deseja excluir:");
                    menu.excluir(scanner.nextInt());
                break;
            }
        } while (option != 5);
    }
}
