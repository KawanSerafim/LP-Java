package main.edu.curso.user_interface.view.condicional;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.condicional.Exercicio11;
import java.util.Scanner;

public class Exercicio11View implements ViewInterface {
    
    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 11",
            "Receba o tipo de investimento, sendo 1 a poupança e 2 a renda fixa, e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias, sabendo que a poupança gera 3% e a renda fixa 5%. Demais tipos de investimentos não serão considerados.",
            "Digite e envie o tipo do investimento, depois o valor dele: \n"
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        int investmentType = scanner.nextInt();
        float investment = scanner.nextFloat();
        Exercicio11 exercicio11 = new Exercicio11();

        return "\n-------------------\n\n" +
            "Resultado: [ R$" + exercicio11.resolve(investmentType, investment) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}