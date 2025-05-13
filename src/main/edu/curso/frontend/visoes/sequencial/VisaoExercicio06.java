package main.edu.curso.frontend.visoes.sequencial;

import java.util.Scanner;
import main.edu.curso.backend.estruturas.logicas.sequencial.Exercicio06;

public class VisaoExercicio06 {
    public void visao(Scanner scanner) {
        Exercicio06 exercicio06 = new Exercicio06();

        System.out.print(
            "\n\n[CONTEXTO]\n\n" +
            "- Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.\n\n" +

            "Digite aqui o valor X: "
        );
        float valorX = scanner.nextFloat();

        System.out.print("\nDigite aqui o valor Y: ");
        float valorY = scanner.nextFloat();

        System.out.println("\nRetorno: [ " + exercicio06.resolucao(valorX, valorY) + " ]");
    }
}