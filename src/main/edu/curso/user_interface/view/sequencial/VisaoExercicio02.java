package main.edu.curso.user_interface.view.sequencial;

import java.util.Scanner;

import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio02;

public class VisaoExercicio02 {
    public void visao(Scanner scanner) {
        Exercicio02 ex02 = new Exercicio02();

        System.out.print(
            "\n\n[CONTEXTO]\n\n" +
            "- Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.\n\n" +

            "Digite aqui o salário: "
        );
        float salario = scanner.nextFloat();
        System.out.println("\nRetorno [ " + ex02.resolucao(salario) + " ]");
    }
}