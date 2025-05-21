package main.edu.curso.user_interface.view.sequencial;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio12;
import java.util.Scanner;

public class Exercicio12View implements ViewInterface {

    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 12",
            "Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.",
            "Digite e envie o ano de nascimento, depois o atual: \n"
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        int birthYear = scanner.nextInt();
        int nowYear = scanner.nextInt();
        Exercicio12 exercicio12 = new Exercicio12();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio12.resolve(birthYear, nowYear) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}