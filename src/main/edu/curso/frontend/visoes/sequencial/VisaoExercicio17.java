package main.edu.curso.frontend.visoes.sequencial;

import java.util.Scanner;
import main.edu.curso.backend.estruturas.logicas.sequencial.Exercicio17;

public class VisaoExercicio17 {
    public void visao(Scanner scanner) {
        Exercicio17 exercicio17 = new Exercicio17();

        System.out.print(
            "\n\n[CONTEXTO]\n\n" +
            "- Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso em horas e a velocidade média.\n\n" +

            "Digite aqui o tempo do percurso: "
        );
        int tempo = scanner.nextInt();

        System.out.print("\nDigite aqui a velocidade média: ");
        int vm = scanner.nextInt();

        System.out.println("\nRetorno: [ " + exercicio17.resolucao(tempo, vm) + " litros ]");
    }
}