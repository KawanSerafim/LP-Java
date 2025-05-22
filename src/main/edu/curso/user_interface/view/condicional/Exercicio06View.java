package main.edu.curso.user_interface.view.condicional;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.condicional.Exercicio06;
import java.util.Scanner;

public class Exercicio06View implements ViewInterface {
    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 6",
            "Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.",
            "Digite e envie o primeiro valor, depois o segundo, depois o terceiro, por fim o quarto: \n"
        );
        
        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        float value1 = scanner.nextFloat();
        float value2 = scanner.nextFloat();
        float value3 = scanner.nextFloat();
        float value4 = scanner.nextFloat();
        Exercicio06 exercicio06 = new Exercicio06();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio06.resolve(value1, value2, value3, value4) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}