package main.edu.curso.user_interface.view.condicional;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.condicional.Exercicio02;
import java.util.Scanner;

public class Exercicio02View implements ViewInterface {

    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 02",
            "Receba 2 valores reais. Mostre o maior deles.",
            "Digite e envie o primeiro valor, depois o segundo: \n"
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        float value1 = scanner.nextFloat();
        float value2 = scanner.nextFloat();
        Exercicio02 exercicio02 = new Exercicio02();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio02.resolve(value1, value2) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}