package main.edu.curso.user_interface.view.sequencial;

import java.util.Scanner;

import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio15;

public class VisaoExercicio15 {
    public void visao(Scanner scanner) {
        Exercicio15 exercicio15 = new Exercicio15();

        System.out.print(
            "\n\n[CONTEXTO]\n\n" +
            "- Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.\n\n " +

            "Digite aqui o cateto 1: "
        );
        float cateto1 = scanner.nextFloat();

        System.out.print("\nDigite aqui o cateto 2: ");
        float cateto2 = scanner.nextFloat();

        System.out.println("\nRetorno: [ " + exercicio15.resolucao(cateto1, cateto2) + " ]");
    }
}