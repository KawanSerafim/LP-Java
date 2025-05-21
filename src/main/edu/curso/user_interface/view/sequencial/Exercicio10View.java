package main.edu.curso.user_interface.view.sequencial;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio10;
import java.util.Scanner;

public class Exercicio10View implements ViewInterface {

    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 10",
            "Receba 2 números reais. Calcule e mostre a diferença desses valores.",
            "Digite e envie o primeiro número, depois o segundo: \n"
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        float number1 = scanner.nextFloat();
        float number2 = scanner.nextFloat();
        Exercicio10 exercicio10 = new Exercicio10();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio10.resolve(number1, number2) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}