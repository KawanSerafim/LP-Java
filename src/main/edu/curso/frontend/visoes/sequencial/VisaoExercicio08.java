package main.edu.curso.frontend.visoes.sequencial;

import java.util.Scanner;
import main.edu.curso.backend.estruturas.logicas.sequencial.Exercicio08;

public class VisaoExercicio08 {
    public void visao(Scanner scanner) {
        Exercicio08 exercicio08 = new Exercicio08();

        System.out.print(
            "\n\n[CONTEXTO]\n\n" +
            "- Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.\n\n" +

            "Digite aqui a poupança: "
        );
        float poupanca = scanner.nextFloat();

        System.out.println("\nRetorno: [ R$" + exercicio08.resolucao(poupanca) + " ]");
    }
}