package main.edu.curso.user_interface.menus.logicas;

import main.edu.curso.user_interface.menus.MenuInterface;
import main.edu.curso.user_interface.menus.BuildMenu;
import java.util.Scanner;

public class ELMenu implements MenuInterface{

    @Override
    public void showMenu() {

        String[] options = {
            "Estrutura Sequencial.",
            "Estrutura Condicional.",
            "Estrutura de Repetição."
        };

        BuildMenu buildMenu = new BuildMenu("ESTRUTURAS LÓGICAS", options);
        System.out.print(buildMenu.displayMenu());        
    }

    @Override
    public void choiceMenu(Scanner scanner) {
        
        int option;

        while(true) {

            option = scanner.nextInt();

            switch(option) {

                case 1:

                    SequencialMenu menuSequencial = new SequencialMenu();
                    menuSequencial.menu(scanner);
                    break;
                case 2:

                    CondicionalMenu condicionalMenu = new CondicionalMenu();
                    condicionalMenu.menu(scanner);
                    break;
                case 3:

                    break;
                case 0:

                    System.out.print("\nSaindo...");
                    break;
                default:
                
                    System.out.print("\n\nErro de input não reconhecido. tenha certeza que está digitando as opções fornecidas.");
            }

            if(option == 0) {
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