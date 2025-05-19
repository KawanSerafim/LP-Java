package main.edu.curso.user_interface.view.sequencial;

import java.util.Scanner;

import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio05;

public class VisaoExercicio05 {
    public void visao(Scanner scanner) {
        Exercicio05 exercicio05 = new Exercicio05();

        System.out.print(
            "\n\n[CONTEXTO]\n\n" +
            "- Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue 2 raízes).\n\n " +

            "Digite aqui o coeficiente A: "
        );
        int coefA = scanner.nextInt();

        System.out.print("\nDigite aqui o coeficiente B: ");
        int coefB = scanner.nextInt();

        System.out.print("\nDigite aqui o coeficiente C: ");
        int coefC = scanner.nextInt();

        System.out.println("\nRetorno: [ " + exercicio05.resolucao(coefA, coefB, coefC) + " ]");
    }
}