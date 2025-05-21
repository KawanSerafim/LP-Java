package main.edu.curso.user_interface.menus.logicas;

import main.edu.curso.user_interface.menus.MenuInterface;
import main.edu.curso.user_interface.menus.BuildMenu;
import main.edu.curso.user_interface.view.sequencial.Exercicio01View;
import main.edu.curso.user_interface.view.sequencial.Exercicio02View;
import main.edu.curso.user_interface.view.sequencial.Exercicio03View;
import main.edu.curso.user_interface.view.sequencial.Exercicio04View;
import main.edu.curso.user_interface.view.sequencial.Exercicio05View;
import main.edu.curso.user_interface.view.sequencial.Exercicio06View;
import main.edu.curso.user_interface.view.sequencial.Exercicio07View;
import main.edu.curso.user_interface.view.sequencial.Exercicio08View;
import main.edu.curso.user_interface.view.sequencial.Exercicio09View;
import main.edu.curso.user_interface.view.sequencial.Exercicio10View;
import main.edu.curso.user_interface.view.sequencial.Exercicio11View;
import main.edu.curso.user_interface.view.sequencial.Exercicio12View;
import main.edu.curso.user_interface.view.sequencial.Exercicio13View;
import main.edu.curso.user_interface.view.sequencial.Exercicio14View;
import main.edu.curso.user_interface.view.sequencial.Exercicio15View;
import main.edu.curso.user_interface.view.sequencial.Exercicio16View;
import main.edu.curso.user_interface.view.sequencial.Exercicio17View;
import java.util.Scanner;

public class SequencialMenu implements MenuInterface {
    
    @Override
    public void showMenu() {

        String[] options = {
            "Exercício 01.",
            "Exercicio 02.",
            "Exercício 03.",
            "Exercício 04.",
            "Exercício 05.",
            "Exercício 06.",
            "Exercício 07.",
            "Exercício 08.",
            "Exercício 09.",
            "Exercício 10.",
            "Exercício 11.",
            "Exercício 12.",
            "Exercício 13.",
            "Exercício 14.",
            "Exercício 15.",
            "Exercício 16.",
            "Exercício 17.",
        };

        BuildMenu buildMenu = new BuildMenu("ESTRUTURA SEQUENCIAL", options);
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
                case 12:
                
                    Exercicio12View exercicio12View = new Exercicio12View();
                    exercicio12View.view(scanner);
                    break;
                case 13:

                    Exercicio13View exercicio13View = new Exercicio13View();
                    exercicio13View.view(scanner);
                    break;
                case 14:

                    Exercicio14View exercicio14View = new Exercicio14View();
                    exercicio14View.view(scanner);
                    break;
                case 15:

                    Exercicio15View exercicio15View = new Exercicio15View();
                    exercicio15View.view(scanner);
                    break;
                case 16:

                    Exercicio16View exercicio16View = new Exercicio16View();
                    exercicio16View.view(scanner);
                    break;
                case 17:

                    Exercicio17View exercicio17View = new Exercicio17View();
                    exercicio17View.view(scanner);
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