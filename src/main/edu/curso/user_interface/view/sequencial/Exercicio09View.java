package main.edu.curso.user_interface.view.sequencial;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio09;
import java.util.Scanner;

public class Exercicio09View implements ViewInterface {

    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 09",
            "Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.",
            "Digite e envie o primeiro valor, depois o segundo: \n"
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        Exercicio09 exercicio09 = new Exercicio09();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio09.resolve(value1, value2) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }   
}