package main.edu.curso.user_interface.view.repeticao;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.repeticao.Exercicio02;
import java.util.Scanner;

public class Exercicio02View implements ViewInterface {
    
    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 02",
            "Receba um número inteiro. Calcule e mostre o seu fatorial.",
            "Digite e envie o número: "
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        int number = scanner.nextInt();
        Exercicio02 exercicio02 = new Exercicio02();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio02.resolve(number) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}