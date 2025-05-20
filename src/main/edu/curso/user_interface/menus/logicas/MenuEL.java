package main.edu.curso.user_interface.menus.logicas;

import main.edu.curso.user_interface.menus.MenuInterface;
import main.edu.curso.user_interface.menus.BuildMenu;
import java.util.Scanner;

public class MenuEL implements MenuInterface{

    @Override
    public void showMenu() {

        String[] opcoes = {
            "Estrutura Sequencial.",
            "Estrutura Condicional.",
            "Estrutura de Repetição."
        };

        BuildMenu buildMenu = new BuildMenu("ESTRUTURAS LÓGICAS", opcoes);
        System.out.print(buildMenu.displayMenu());        
    }

    @Override
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

                    CondicionalMenu condicionalMenu = new CondicionalMenu();
                    condicionalMenu.menu(scanner);
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

    @Override
    public void menu(Scanner scanner) {
        
        showMenu();
        choiceMenu(scanner);
    }
}