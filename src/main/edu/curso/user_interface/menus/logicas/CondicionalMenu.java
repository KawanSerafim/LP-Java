package main.edu.curso.user_interface.menus.logicas;

import main.edu.curso.user_interface.menus.MenuInterface;
import main.edu.curso.user_interface.menus.BuildMenu;
import main.edu.curso.user_interface.view.condicional.Exercicio18View;
import main.edu.curso.user_interface.view.condicional.Exercicio19View;
import java.util.Scanner;

public class CondicionalMenu implements MenuInterface{

    @Override
    public void showMenu() {
        
        String[] options = {
            "Exercício 18.",
            "Exercício 19."
        };

        BuildMenu buildMenu = new BuildMenu("MENU CONDICIONAL", options);
        System.out.print(buildMenu.displayMenu());
    }

    @Override
    public void choiceMenu(Scanner scanner) {
        
        int option;

        while(true) {

            option = scanner.nextInt();

            switch(option) {

                case 1:

                    Exercicio18View exercicio18View = new Exercicio18View();
                    exercicio18View.view(scanner);
                    break;
                case 2:

                    Exercicio19View exercicio19View = new Exercicio19View();
                    exercicio19View.view(scanner);
                    break;
                case 0:

                    System.out.print("\nSaindo...");
                    break;
                default:
                    
                    System.out.print("\n\nErro de input não reconhecido. Tenha certeza de que está digitando as opções fornecidas.");
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