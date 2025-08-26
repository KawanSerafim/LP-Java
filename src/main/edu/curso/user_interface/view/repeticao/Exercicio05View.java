package main.edu.curso.user_interface.view.repeticao;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.repeticao.Exercicio05;
import java.util.Scanner;

public class Exercicio05View implements ViewInterface {
    
    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 05",
            "Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.",
            "Digite e envie os 2 números: \n"
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        Exercicio05 exercicio05 = new Exercicio05();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio05.resolve(number1, number2) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}