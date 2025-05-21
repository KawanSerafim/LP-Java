package main.edu.curso.user_interface.view.sequencial;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio15;
import java.util.Scanner;

public class Exercicio15View implements ViewInterface {

    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 15",
            "Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.",
            "Digite e envie o primeiro cateto, depois o segundo: \n"
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        float cathet1 = scanner.nextFloat();
        float cathet2 = scanner.nextFloat();
        Exercicio15 exercicio15 = new Exercicio15();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio15.resolve(cathet1, cathet2) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}