package main.edu.curso.frontend.menus.logicas;

import java.util.Scanner;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio01;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio02;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio03;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio04;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio05;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio06;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio07;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio08;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio09;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio10;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio11;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio12;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio13;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio14;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio15;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio16;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio17;

public class MenuSequencial {
    public void menu(Scanner scanner) {
        int opcao = 0;

        do {
            System.out.print(
            "\n\n[SEQUENCIAL]\n\n" +
            "1: Exercício 01.\n" +
            "2: Exercício 02.\n" +
            "3: Exercício 03.\n" +
            "4: Exercício 04.\n" +
            "5: Exercício 05.\n" +
            "6: Exercício 06.\n" +
            "7: Exercício 07.\n" +
            "8: Exercício 08.\n" +
            "9: Exercício 09.\n" +
            "10: Exercício 10.\n" +
            "11: Exercício 11.\n" +
            "12: Exercício 12.\n" +
            "13: Exercício 13.\n" +
            "14: Exercício 14.\n" +
            "15: Exercício 15.\n" +
            "16: Exercício 16.\n" +
            "17: Exercício 17.\n" +
            "0: Sair.\n\n" +
            "R: "
            );
            opcao = scanner.nextInt();

            switch(opcao) {
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
                case 0:
                    System.out.println("\nSaindo. . .");
                    break;
                default:
                    System.out.print("\n\nErro de input não reconhecido. tenha certeza que está digitando as opções fornecidas.");
            }
        } while(opcao != 0);
    }
}