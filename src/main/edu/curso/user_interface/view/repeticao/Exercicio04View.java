package main.edu.curso.user_interface.view.repeticao;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.repeticao.Exercicio04;
import java.util.Scanner;

public class Exercicio04View implements ViewInterface {
    
    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 04",
            "Receba um número inteiro. Calcule e mostre os resultados da tabuada do 1 ao 10 desse número.",
            "Digite e envie o número: "
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {

        int number = scanner.nextInt();
        Exercicio04 exercicio04 = new Exercicio04();

        return "\n-------------------\n\n" +
            "Resultado: \n" + exercicio04.resolve(number);
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}