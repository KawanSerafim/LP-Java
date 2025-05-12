package main.edu.curso.frontend.menus.logicas;

import java.util.Scanner;

import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio01;
import main.edu.curso.frontend.visoes.sequencial.VisaoExercicio02;

public class MenuSequencial {
    public void menu(Scanner scanner) {
        int opcao = 0;

        do {
            System.out.print(
            "\n\n[SEQUENCIAL]\n\n" +
            "1: Exercício 01.\n" +
            "2: Exercício 02.\n" +
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
                case 0:
                    System.out.println("\nSaindo. . .");
                    break;
                default:
                    System.out.print("\n\nErro de input não reconhecido. tenha certeza que está digitando as opções fornecidas.");
            }
        } while(opcao != 0);
    }
}