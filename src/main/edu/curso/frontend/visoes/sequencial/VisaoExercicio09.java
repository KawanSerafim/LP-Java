package main.edu.curso.frontend.visoes.sequencial;

import java.util.Scanner;
import main.edu.curso.backend.estruturas.logicas.sequencial.Exercicio09;

public class VisaoExercicio09 {
    public void visao(Scanner scanner) {
        Exercicio09 exercicio09 = new Exercicio09();

        System.out.print(
            "\n\n[CONTEXTO]\n\n" +
            "- Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.\n\n" +

            "Digite aqui o primeiro valor: "
        );
        int valor1 = scanner.nextInt();

        System.out.print("\nDigite aqui o segundo valor: ");
        int valor2 = scanner.nextInt();

        System.out.println("\nRetorno: [ " + exercicio09.resolucao(valor1, valor2) + " ]");
    }
}