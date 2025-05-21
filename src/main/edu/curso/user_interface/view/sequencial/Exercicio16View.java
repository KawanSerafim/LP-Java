package main.edu.curso.user_interface.view.sequencial;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio16;
import java.util.Scanner;

public class Exercicio16View implements ViewInterface {

    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 16",
            "Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.",
            "Digite e envie: \n" +
            "- Quantidade de horas trabalhadas.\n" +
            "- Valor por hora.\n" +
            "- Percentual de desconto.\n" +
            "- Número de descendentes.\n"
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        int hoursWorked = scanner.nextInt();
        float hourlyRate = scanner.nextFloat();
        float discountPercentage = scanner.nextFloat();
        int descendantsNumber = scanner.nextInt();
        Exercicio16 exercicio16 = new Exercicio16();

        return "\n-------------------\n\n" +
            "Resultado: [ R$" + exercicio16.resolve(hoursWorked, hourlyRate, discountPercentage, descendantsNumber) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}