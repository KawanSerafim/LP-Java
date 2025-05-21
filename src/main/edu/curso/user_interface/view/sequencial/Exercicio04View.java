package main.edu.curso.user_interface.view.sequencial;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio04;
import java.util.Scanner;

public class Exercicio04View implements ViewInterface {

    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 04",
            "Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160)/5.",
            "Digite e envie a temperatura em Celcius: "
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        float degressCelcius = scanner.nextFloat();
        Exercicio04 exercicio04 = new Exercicio04();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio04.resolve(degressCelcius) + "°F ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }   
}