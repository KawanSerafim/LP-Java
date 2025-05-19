package main.edu.curso.user_interface.menus.logicas;

import java.util.Scanner;
import main.edu.curso.user_interface.menus.BuildMenu;
import main.edu.curso.user_interface.menus.MenuInterface;

public class MenuEL implements MenuInterface{
    
    public void showMenu() {

        String[] opcoes = {
            "Estrutura Sequencial.",
            "Estrutura Condicional.",
            "Estrutura de Repetição."
        };
        BuildMenu buildMenu = new BuildMenu("ESTRUTURAS LÓGICAS", opcoes);

        System.out.print(buildMenu.displayMenu());        

    }

    public void choiceMenu(Scanner scanner) {
        int opcao;

        while(true) {

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

                    System.out.println("\nSaindo...");
                    break;

                default:
                    System.out.print("\n\nErro de input não reconhecido. tenha certeza que está digitando as opções fornecidas.");
            }

            if(opcao == 0) {
                break;
            }

            showMenu();

        }
    }

    public void menu(Scanner scanner) {
        showMenu();
        choiceMenu(scanner);
    }

}