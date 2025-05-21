package main.edu.curso.user_interface.view.sequencial;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio06;
import java.util.Scanner;

public class Exercicio06View implements ViewInterface {

    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 06",
            "Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.",
            "Digite e envie o valor x, depois valor y: \n"
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        float valueX = scanner.nextInt();
        float valueY = scanner.nextInt();
        Exercicio06 exercicio06 = new Exercicio06();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio06.resolve(valueX, valueY) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}