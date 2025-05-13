package main.edu.curso.frontend.visoes.sequencial;

import java.util.Scanner;
import main.edu.curso.backend.estruturas.logicas.sequencial.Exercicio03;

public class VisaoExercicio03 {
    public void visao(Scanner scanner) {
        Exercicio03 exercicio03 = new Exercicio03();

        System.out.print(
            "\n\n[CONTEXTO]\n\n" +
            "- Receba a base e a altura de um triângulo. Calcule e mostre a sua área.\n\n" +

            "Digite aqui a base do triângulo: "
        );
        float base = scanner.nextFloat();

        System.out.print("\nDigite aqui a altura do triângulo: ");
        float altura = scanner.nextFloat();

        System.out.println("\nRetorno [ " + exercicio03.resolucao(base, altura) + " ]");
    }
}