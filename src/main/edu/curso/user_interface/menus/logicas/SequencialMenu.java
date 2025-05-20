package main.edu.curso.user_interface.menus.logicas;

import main.edu.curso.user_interface.menus.MenuInterface;
import main.edu.curso.user_interface.menus.BuildMenu;
import main.edu.curso.user_interface.view.sequencial.VisaoExercicio01;
import main.edu.curso.user_interface.view.sequencial.VisaoExercicio02;
import main.edu.curso.user_interface.view.sequencial.VisaoExercicio03;
import main.edu.curso.user_interface.view.sequencial.VisaoExercicio04;
import main.edu.curso.user_interface.view.sequencial.VisaoExercicio05;
import main.edu.curso.user_interface.view.sequencial.VisaoExercicio06;
import main.edu.curso.user_interface.view.sequencial.VisaoExercicio07;
import main.edu.curso.user_interface.view.sequencial.VisaoExercicio08;
import main.edu.curso.user_interface.view.sequencial.VisaoExercicio09;
import main.edu.curso.user_interface.view.sequencial.VisaoExercicio10;
import main.edu.curso.user_interface.view.sequencial.VisaoExercicio11;
import main.edu.curso.user_interface.view.sequencial.VisaoExercicio12;
import main.edu.curso.user_interface.view.sequencial.VisaoExercicio13;
import main.edu.curso.user_interface.view.sequencial.VisaoExercicio14;
import main.edu.curso.user_interface.view.sequencial.VisaoExercicio15;
import main.edu.curso.user_interface.view.sequencial.VisaoExercicio16;
import main.edu.curso.user_interface.view.sequencial.VisaoExercicio17;
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

                    VisaoExercicio01 vEx01 = new VisaoExercicio01();
                    vEx01.visao(scanner);
                    break;
                case 2:

                    VisaoExercicio02 vEx02 = new VisaoExercicio02();
                    vEx02.visao(scanner);
                    break;
                case 3:

                    VisaoExercicio03 vEx03 = new VisaoExercicio03();
                    vEx03.visao(scanner);
                    break;
                case 4:

                    VisaoExercicio04 vEx04 = new VisaoExercicio04();
                    vEx04.visao(scanner);
                    break;
                case 5:

                    VisaoExercicio05 vEx05 = new VisaoExercicio05();
                    vEx05.visao(scanner);
                    break;
                case 6:

                    VisaoExercicio06 vEx06 = new VisaoExercicio06();
                    vEx06.visao(scanner);
                    break;
                case 7:

                    VisaoExercicio07 vEx07 = new VisaoExercicio07();
                    vEx07.visao(scanner);
                    break;
                case 8:

                    VisaoExercicio08 vEx08 = new VisaoExercicio08();
                    vEx08.visao(scanner);
                    break;
                case 9:

                    VisaoExercicio09 vEx09 = new VisaoExercicio09();
                    vEx09.visao(scanner);
                    break;
                case 10:

                    VisaoExercicio10 vEx10 = new VisaoExercicio10();
                    vEx10.visao(scanner);
                    break;
                case 11:

                    VisaoExercicio11 vEx11 = new VisaoExercicio11();
                    vEx11.visao(scanner);
                    break;
                case 12:
                
                    VisaoExercicio12 vEx12 = new VisaoExercicio12();
                    vEx12.visao(scanner);
                    break;
                case 13:

                    VisaoExercicio13 vEx13 = new VisaoExercicio13();
                    vEx13.visao(scanner);
                    break;
                case 14:

                    VisaoExercicio14 vEx14 = new VisaoExercicio14();
                    vEx14.visao(scanner);
                    break;
                case 15:

                    VisaoExercicio15 vEx15 = new VisaoExercicio15();
                    vEx15.visao(scanner);
                    break;
                case 16:

                    VisaoExercicio16 vEx16 = new VisaoExercicio16();
                    vEx16.visao(scanner); 
                    break;
                case 17:

                    VisaoExercicio17 vEx17 = new VisaoExercicio17();
                    vEx17.visao(scanner);
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