package main.edu.curso.user_interface.view.sequencial;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio07;
import java.util.Scanner;

public class Exercicio07View implements ViewInterface {

    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 07",
            "Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.",
            "Digite e envie o valor para o comprimento, depois largura, e por fim a altura: \n"
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        float lenght = scanner.nextFloat();
        float width = scanner.nextFloat();
        float heigth = scanner.nextFloat();
        Exercicio07 exercicio07 = new Exercicio07();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio07.resolve(lenght, width, heigth) + "m³ ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }    
}