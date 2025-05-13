package main.edu.curso.frontend.visoes.sequencial;

import java.util.Scanner;
import main.edu.curso.backend.estruturas.logicas.sequencial.Exercicio04;

public class VisaoExercicio04 {
    public void visao(Scanner scanner) {
        Exercicio04 exercicio04 = new Exercicio04();
        
        System.out.print(
            "\n\n[CONTEXTO]\n\n" +
            "- Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160)/5.\n\n" +

            "Digite aqui os graus Celcius: "
        );
        float grausCelcius = scanner.nextFloat();
        System.out.println("\nRetorno [ " + exercicio04.resolucao(grausCelcius) + " °F ]");
    }
}