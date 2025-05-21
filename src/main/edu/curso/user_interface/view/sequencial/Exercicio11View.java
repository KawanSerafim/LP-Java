package main.edu.curso.user_interface.view.sequencial;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio11;
import java.util.Scanner;

public class Exercicio11View implements ViewInterface {

    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 11",
            "Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.",
            "Digite e envie o raio: "
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        float radius = scanner.nextFloat();
        Exercicio11 exercicio11 = new Exercicio11();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio11.resolve(radius) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}