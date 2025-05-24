package main.edu.curso.user_interface.view.repeticao;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.repeticao.Exercicio01;
import java.util.Scanner;

public class Exercicio01View implements ViewInterface {
 
    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 01",
            "Calcule e mostre o quadrado dos números entre 10 e 150.",
            "Digite e envie 1 para ativar o código: "
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        int order = scanner.nextInt();
        Exercicio01 exercicio01 = new Exercicio01();

        return "\n-------------------\n\n" +
            "Resultado: \n" + exercicio01.resolve(order);
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}