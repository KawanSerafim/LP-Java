package main.edu.curso.user_interface.view.condicional;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.condicional.Exercicio09;
import java.util.Scanner;

public class Exercicio09View implements ViewInterface {
 
    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 09",
            "Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.",
            "Digite e envie o primeiro número, depois o segundo: \n"
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        Exercicio09 exercicio09 = new Exercicio09();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio09.resolve(number1, number2) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}