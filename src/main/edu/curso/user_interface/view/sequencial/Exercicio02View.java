package main.edu.curso.user_interface.view.sequencial;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio02;
import java.util.Scanner;

public class Exercicio02View implements ViewInterface {

    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 02", 
            "Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.",
            "Digite o salário: "
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        float wage = scanner.nextFloat();
        Exercicio02 exercicio02 = new Exercicio02();

        return "\n-------------------\n\n" +
            "Resultado: [ R$" + exercicio02.resolucao(wage) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }   
}