package main.edu.curso.user_interface.menus.logicas;

import main.edu.curso.user_interface.menus.MenuInterface;
import main.edu.curso.user_interface.menus.BuildMenu;
import main.edu.curso.user_interface.view.repeticao.Exercicio01View;
import main.edu.curso.user_interface.view.repeticao.Exercicio02View;
import main.edu.curso.user_interface.view.repeticao.Exercicio03View;
import java.util.Scanner;

public class RepeticaoMenu implements MenuInterface {

    @Override
    public void showMenu() {
        
        String[] options = {
            "Exercício 1.",
            "Exercício 2.",
            "Exercício 3."
        };

        BuildMenu buildMenu = new BuildMenu("MENU DE REPETIÇÃO", options);
        System.out.print(buildMenu.displayMenu());
    }

    @Override
    public void choiceMenu(Scanner scanner) {
        
        int option;
        
        while(true) {

            option = scanner.nextInt();

            switch(option) {

                case 1:

                    Exercicio01View exercicio01View = new Exercicio01View();
                    exercicio01View.view(scanner);
                    break;
                case 2:

                    Exercicio02View exercicio02View = new Exercicio02View();
                    exercicio02View.view(scanner);
                    break;

                case 3:

                    Exercicio03View exercicio03View = new Exercicio03View();
                    exercicio03View.view(scanner);
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