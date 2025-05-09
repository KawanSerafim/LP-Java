package main.edu.curso.menu.logicas;

import java.util.Scanner;

public class MenuEL {
    public void menu(Scanner scanner) {
        int opcao = 0;

        do {
            System.out.print(
            "\n\n[ESTRUTURAS LÓGICAS]\n\n" +
            "1: Sequencial.\n" +
            "2: Condicional.\n" +
            "3: Repetição.\n" +
            "0: Sair.\n\n" +
            "R: "
            );
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    MenuSequencial menuSequencial = new MenuSequencial();
                    menuSequencial.menu(scanner);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 0:
                    System.out.println("\nSaindo. . .");
                    break;
                default:
                    System.out.print("\n\nErro de input não reconhecido. tenha certeza que está digitando as opções fornecidas.");
            }
        } while(opcao != 0);
    }
}