package main.edu.curso.user_interface.menus.logicas;

import main.edu.curso.user_interface.menus.MenuInterface;
import main.edu.curso.user_interface.menus.BuildMenu;
import main.edu.curso.user_interface.view.condicional.Exercicio01View;
import main.edu.curso.user_interface.view.condicional.Exercicio02View;
import main.edu.curso.user_interface.view.condicional.Exercicio03View;
import main.edu.curso.user_interface.view.condicional.Exercicio04View;
import main.edu.curso.user_interface.view.condicional.Exercicio05View;
import main.edu.curso.user_interface.view.condicional.Exercicio06View;
import main.edu.curso.user_interface.view.condicional.Exercicio07View;
import main.edu.curso.user_interface.view.condicional.Exercicio08View;
import main.edu.curso.user_interface.view.condicional.Exercicio09View;
import main.edu.curso.user_interface.view.condicional.Exercicio10View;
import main.edu.curso.user_interface.view.condicional.Exercicio11View;
import java.util.Scanner;

public class CondicionalMenu implements MenuInterface{

    @Override
    public void showMenu() {
        
        String[] options = {
            "Exercício 1.",
            "Exercício 2.",
            "Exercício 3.",
            "Exercício 4.",
            "Exercício 5.",
            "Exercício 6.",
            "Exercício 7.",
            "Exercício 8.",
            "Exercício 9.",
            "Exercício 10.",
            "Exercício 11."
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

                case 4:

                    Exercicio04View exercicio04View = new Exercicio04View();
                    exercicio04View.view(scanner);
                    break;

                case 5:

                    Exercicio05View exercicio05View = new Exercicio05View();
                    exercicio05View.view(scanner);
                    break;

                case 6:

                    Exercicio06View exercicio06View = new Exercicio06View();
                    exercicio06View.view(scanner);
                    break;

                case 7:

                    Exercicio07View exercicio07View = new Exercicio07View();
                    exercicio07View.view(scanner);
                    break;
                case 8:

                    Exercicio08View exercicio08View = new Exercicio08View();
                    exercicio08View.view(scanner);
                    break;
                case 9:

                    Exercicio09View exercicio09View = new Exercicio09View();
                    exercicio09View.view(scanner);
                    break;

                case 10:

                    Exercicio10View exercicio10View = new Exercicio10View();
                    exercicio10View.view(scanner);
                    break;
                case 11:

                    Exercicio11View exercicio11View = new Exercicio11View();
                    exercicio11View.view(scanner);
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