package main.edu.curso.user_interface.view.sequencial;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio01;
import java.util.Scanner;

public class Exercicio01View implements ViewInterface {
    
    @Override
    public String showContext() {

        BuildView buildView = new BuildView(
            "EXERCÍCIO 1", 
            "Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.",
            "Digite e envie o valor do lado: "
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {

        float side = scanner.nextFloat();
        Exercicio01 exercicio01 = new Exercicio01();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio01.resolve(side) + "m² ]";
    }
    
    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}