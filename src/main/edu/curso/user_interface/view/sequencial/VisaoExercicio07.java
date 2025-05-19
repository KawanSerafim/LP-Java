package main.edu.curso.user_interface.view.sequencial;

import java.util.Scanner;

import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio07;

public class VisaoExercicio07 {
    public void visao(Scanner scanner) {
        Exercicio07 exercicio07 = new Exercicio07();

        System.out.print(
            "\n\n[CONTEXTO]\n\n" +
            "- Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.\n\n" +

            "Digite aqui o comprimento: "
        );
        float comprimento = scanner.nextFloat();

        System.out.print("\nDigite aqui a largura: ");
        float largura = scanner.nextFloat();

        System.out.print("\nDigite aqui o valor da altura: ");
        float altura = scanner.nextFloat();

        System.out.println("\nRetorno: [ " + exercicio07.resolusao(comprimento, largura, altura) + "m³ ]");
    }
}