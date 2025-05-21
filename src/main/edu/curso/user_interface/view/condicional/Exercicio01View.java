package main.edu.curso.user_interface.view.condicional;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.condicional.Exercicio01;
import java.util.Scanner;

public class Exercicio01View implements ViewInterface {

    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 01",
            "Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor.",
            "Digite e envie o primeiro valor, depois o segundo: \n"
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        Exercicio01 exercicio01 = new Exercicio01();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio01.resolve(value1, value2) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}