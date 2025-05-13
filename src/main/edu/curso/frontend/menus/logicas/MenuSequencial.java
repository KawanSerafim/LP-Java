package main.edu.curso.frontend.menus.logicas;

import java.util.Scanner;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio01;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio02;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio03;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio04;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio05;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio06;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio07;

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
                case 0:
                    System.out.println("\nSaindo. . .");
                    break;
                default:
                    System.out.print("\n\nErro de input não reconhecido. tenha certeza que está digitando as opções fornecidas.");
            }
        } while(opcao != 0);
    }
}