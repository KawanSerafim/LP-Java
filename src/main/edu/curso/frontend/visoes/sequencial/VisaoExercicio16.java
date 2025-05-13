package main.edu.curso.frontend.visoes.sequencial;

import java.util.Scanner;
import main.edu.curso.backend.estruturas.logicas.sequencial.Exercicio16;

public class VisaoExercicio16 {
    public void visao(Scanner scanner) {
        Exercicio16 exercicio16 = new Exercicio16();

        System.out.print(
            "\n\n[CONTEXTO]\n\n" +
            "- Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.\n\n" +

            "Digite aqui a quantidade de horas trabalhadas: "
        );
        int hTrabalhadas = scanner.nextInt();

        System.out.print("\nDigite aqui o valor por hora: ");
        int vHora = scanner.nextInt();

        System.out.print("\nDigite aqui o percentual de desconto: ");
        float desconto = scanner.nextFloat();

        System.out.print("\nDigite aqui a quantidade de descendentes: ");
        int nDescendentes = scanner.nextInt();

        System.out.println("\nRetorno: [ R$" + exercicio16.resolucao(hTrabalhadas, vHora, desconto, nDescendentes) + " ]");
    }
}