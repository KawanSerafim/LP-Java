package main.edu.curso.user_interface.view.sequencial;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio03;
import java.util.Scanner;

public class Exercicio03View implements ViewInterface {

    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO",
            "Receba a base e a altura de um triângulo. Calcule e mostre a sua área.",
            "Digite a base e a altura do triângulo:\n"
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        float base = scanner.nextFloat();
        float height = scanner.nextFloat();
        Exercicio03 exercicio03 = new Exercicio03();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio03.resolucao(base, height) + "m² ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}