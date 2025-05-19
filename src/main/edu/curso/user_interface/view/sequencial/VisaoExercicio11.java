package main.edu.curso.user_interface.view.sequencial;

import java.util.Scanner;

import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio11;

public class VisaoExercicio11 {
    public void visao(Scanner scanner) {
        Exercicio11 exercicio11 = new Exercicio11();

        System.out.print(
            "\n\n[CONTEXTO]\n\n" +
            "- Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.\n\n" +

            "Digite aqui o raio: "
        );
        float raio = scanner.nextFloat();
        System.out.println("\nRetorno: [ " + exercicio11.resolucao(raio) + " ]");
    }
}