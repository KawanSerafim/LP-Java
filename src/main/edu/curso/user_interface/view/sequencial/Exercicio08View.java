package main.edu.curso.user_interface.view.sequencial;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio08;
import java.util.Scanner;

public class Exercicio08View implements ViewInterface {

    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 08",
            "Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.",
            "Digite e envie o valor do depósito: "
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        float deposit = scanner.nextFloat();
        Exercicio08 exercicio08 = new Exercicio08();

        return "\n-------------------\n\n" +
            "Resultado: [ R$" + exercicio08.resolve(deposit) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}