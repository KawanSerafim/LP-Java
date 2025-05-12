package main.edu.curso.menus.logicas.sequencial;

import java.util.Scanner;

import main.edu.curso.estruturas.logicas.sequencial.Exercicio01;

public class VisaoExercicio01 {
    public void visao(Scanner scanner) {
        Exercicio01 ex01 = new Exercicio01();

        System.out.print(
            "\n\n[CONTEXTO]\n\n" +
            "- Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.\n\n" +

            "Digite aqui o valor de um dos lados do quadrado: "
        );
        float lado = scanner.nextFloat();

        System.out.println("\nRetorno: [ " + ex01.resolucao(lado) + " ]");
    }
}