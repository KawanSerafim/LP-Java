package main.edu.curso.user_interface.view.sequencial;

import java.util.Scanner;

import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio12;

public class VisaoExercicio12 {
    public void visao(Scanner scanner) {
        Exercicio12 exercicio12 = new Exercicio12();

        System.out.print(
            "\n\n[CONTEXTO]\n\n" +
            "- Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.\n\n" +

            "Digite aqui o ano de nascimento: "
        );
        int anoNasc = scanner.nextInt();

        System.out.print("\nDigite aqui o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.println("\nRetorno: [ " + exercicio12.resolucao(anoNasc, anoAtual) + " ]");
    }
}