package main.edu.curso.user_interface.view.condicional;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.condicional.Exercicio07;
import java.util.Scanner;

public class Exercicio07View implements ViewInterface {
    
    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 7",
            "Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.",
            "Digite e envie o valor: "
        );
        
        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        int value = scanner.nextInt();
        Exercicio07 exercicio07 = new Exercicio07();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio07.resolve(value) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}