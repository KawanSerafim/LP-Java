package main.edu.curso.user_interface.view.sequencial;

import java.util.Scanner;

import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio13;

public class VisaoExercicio13 {
    public void visao(Scanner scanner) {
        Exercicio13 exercicio13 = new Exercicio13();

        System.out.print(
            "\n\n[CONTEXTO]\n\n" +
            "- Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.\n\n" +

            "Digite aqui a quantidade em quilos: "
        );
        float quilos = scanner.nextFloat();
        System.out.println("\nRetorno [ " + exercicio13.resolucao(quilos) + " dias ]");
    }
}