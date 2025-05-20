package main.edu.curso.user_interface.view.sequencial;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio05;
import java.util.Scanner;

public class Exercicio05View implements ViewInterface {

    @Override
    public String showContext() {

        BuildView buildView = new BuildView(
            "EXERCÍCIO 05",
            "Receba os coeficientes A, B e C de uma equação do 2º grau. Calcule e mostre as raízes reais (considerar que a equação possue 2 raízes).",
            "Digite os coeficientes A, B e C: \n"
        );
        
        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        int coefficientA = scanner.nextInt();
        int coefficientB = scanner.nextInt();
        int coefficientC = scanner.nextInt();
        Exercicio05 exercicio05 = new Exercicio05();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio05.resolucao(coefficientA, coefficientB, coefficientC) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}