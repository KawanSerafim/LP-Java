package main.edu.curso.menu;

import java.util.Scanner;

import main.edu.curso.menu.dados.MenuED;
import main.edu.curso.menu.logicas.MenuEL;

public class Principal {
    public static void menu() {
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print(
            "\n\n[LÓGICA DE PROGRAMAÇÃO - JAVA]\n\n" +
            "1: Estruturas Lógicas.\n" +
            "2: Estruturas de Dados.\n" +
            "0: Desligar.\n\n" +
            "R: "
            );
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    MenuEL menuEL = new MenuEL();

                    menuEL.menu(scanner);
                    break;
                case 2:
                    MenuED menuED = new MenuED();

                    menuED.menu(scanner);
                    break;
                case 0:
                    System.out.println("\nDesligando. . .");
                    break;
                default:
                    System.out.print("\n\nErro de input não reconhecido. tenha certeza que está digitando as opções fornecidas.");
            }
        } while(opcao != 0);

        scanner.close();
    }

    public static void main(String[] args) {
        try {
            menu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}