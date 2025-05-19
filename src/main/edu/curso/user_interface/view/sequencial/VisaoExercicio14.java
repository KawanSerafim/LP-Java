package main.edu.curso.user_interface.view.sequencial;

import java.util.Scanner;

import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio14;

public class VisaoExercicio14 {
    public void visao(Scanner scanner) {
        Exercicio14 exercicio14 = new Exercicio14();
        
        System.out.print(
            "\n\n[CONTEXTO]\n\n" +
            "- Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.\n\n" +

            "Digite aqui o primeiro ângulo: "
        );
        float angulo1 = scanner.nextFloat();

        System.out.print("\nDigite aqui o segundo ângulo: ");
        float angulo2 = scanner.nextFloat();

        System.out.println("\nRetorno [ " + exercicio14.resolucao(angulo1, angulo2) + "° ]");
    }
}