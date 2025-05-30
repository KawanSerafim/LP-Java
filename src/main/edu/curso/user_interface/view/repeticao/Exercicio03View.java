package main.edu.curso.user_interface.view.repeticao;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.repeticao.Exercicio03;
import java.util.Scanner;

public class Exercicio03View implements ViewInterface {
    
    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 03",
            "Receba um número inteiro. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.",
            "Digite e envie o número: "
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        int number = scanner.nextInt();
        Exercicio03 exercicio03 = new Exercicio03();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio03.resolve(number) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}