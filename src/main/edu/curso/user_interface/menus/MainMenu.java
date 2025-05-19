package main.edu.curso.user_interface.menus;

import java.util.Scanner;
import main.edu.curso.user_interface.menus.dados.MenuED;
import main.edu.curso.user_interface.menus.logicas.MenuEL;

public class MainMenu implements MenuInterface {

    public void showMenu() {

        String[] opcoes = {
            "Estruturas Lógicas.", 
            "Estruturas de Dados."
        };
        BuildMenu buildMenu = new BuildMenu("LÓGICA DE PROGRAMAÇÃO", opcoes);

        System.out.print(buildMenu.displayMenu());
    
    }

    public void choiceMenu(Scanner scanner) {
        int opcao;

        while(true) {

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
                    
                    System.out.println("\nSaindo...");
                    break;
                
                default:
                    System.out.print("\n\nErro de input não reconhecido. Tenha certeza que está digitando as opções fornecidas.");

            }

            if(opcao == 0) {
                break;
            }

            showMenu();

        }

        scanner.close();
    }

    public void menu(Scanner scanner) {
        showMenu();
        choiceMenu(scanner);
    }
        
}