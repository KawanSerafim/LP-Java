package main.edu.curso.user_interface.view.condicional;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.condicional.Exercicio05;
import java.util.Scanner;

public class Exercicio05View implements ViewInterface {

    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 5",
            "Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.",
            "Digite e envie o primeiro valor, depois o segundo: \n"
        );
        
        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        Exercicio05 exercicio05 = new Exercicio05();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio05.resolve(value1, value2) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}