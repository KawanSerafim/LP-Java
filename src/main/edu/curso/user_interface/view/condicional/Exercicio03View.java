package main.edu.curso.user_interface.view.condicional;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.condicional.Exercicio03;
import java.util.Scanner;

public class Exercicio03View implements ViewInterface {
    
    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 03",
            "Receba 3 coeficientes A, B, e C de uma equação do 2º grau. Verifique e mostre a existência de raízes reais. Caso exista, calcule e mostre as raízes.",
            "Digite e envie o coeficiente A, depois o B, e por fim o C: \n"
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        int coefficientA = scanner.nextInt();
        int coefficientB = scanner.nextInt();
        int coefficientC = scanner.nextInt();
        Exercicio03 exercicio03 = new Exercicio03();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio03.resolve(coefficientA, coefficientB, coefficientC) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}