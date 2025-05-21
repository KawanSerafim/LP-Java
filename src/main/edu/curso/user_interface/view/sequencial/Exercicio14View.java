package main.edu.curso.user_interface.view.sequencial;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio14;
import java.util.Scanner;

public class Exercicio14View implements ViewInterface {

    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 14",
            "Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.",
            "Digite e envie o primeiro ângulo, depois o segundo: \n"
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        float angle1 = scanner.nextFloat();
        float angle2 = scanner.nextFloat();
        Exercicio14 exercicio14 = new Exercicio14();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio14.resolve(angle1, angle2) + "° ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}