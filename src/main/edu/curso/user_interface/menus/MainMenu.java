package main.edu.curso.user_interface.menus;

import main.edu.curso.user_interface.menus.logicas.ELMenu;
import main.edu.curso.user_interface.menus.dados.MenuED;
import java.util.Scanner;

public class MainMenu implements MenuInterface {

    @Override
    public void showMenu() {

        String[] options = {
            "Estruturas Lógicas.", 
            "Estruturas de Dados."
        };

        BuildMenu buildMenu = new BuildMenu("LÓGICA DE PROGRAMAÇÃO", options);
        System.out.print(buildMenu.displayMenu());
    }

    public void choiceMenu(Scanner scanner) {

        int option;

        while(true) {

            option = scanner.nextInt();

            switch(option) {

                case 1:

                    ELMenu menuEL = new ELMenu();
                    menuEL.menu(scanner);
                    break;
                case 2:
                    
                    MenuED menuED = new MenuED();
                    menuED.menu(scanner);
                    break;
                case 0:
                    
                    System.out.print("\nSaindo...");
                    break;
                default:
                
                    System.out.print("\n\nErro de input não reconhecido. Tenha certeza que está digitando as opções fornecidas.");
            }

            if(option == 0) {
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