package main.edu.curso.user_interface.view.condicional;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.condicional.Exercicio19;
import java.util.Scanner;

public class Exercicio19View implements ViewInterface {

    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 19",
            "Receba 2 valores reais. Mostre o maior deles.",
            "Digite e envie o primeiro valor, depois o segundo: \n"
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        float value1 = scanner.nextFloat();
        float value2 = scanner.nextFloat();
        Exercicio19 exercicio19 = new Exercicio19();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio19.resolve(value1, value2) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}