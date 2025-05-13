package main.edu.curso.frontend.visoes.sequencial;

import java.util.Scanner;
import main.edu.curso.backend.estruturas.logicas.sequencial.Exercicio10;

public class VisaoExercicio10 {
    public void visao(Scanner scanner) {
        Exercicio10 exercicio10 = new Exercicio10();

        System.out.print(
            "\n\n[CONTEXTO]\n\n" +
            "- Receba 2 números reais. Calcule e mostre a diferença desses valores.\n\n" +

            "Digite aqui o primeiro número: "
        );
        float valor1 = scanner.nextFloat();

        System.out.print("\nDigite aqui o segundo número: ");
        float valor2 = scanner.nextFloat();

        System.out.println("\nRetorno: [ " + exercicio10.resolucao(valor1, valor2) + " ]");
    }
}