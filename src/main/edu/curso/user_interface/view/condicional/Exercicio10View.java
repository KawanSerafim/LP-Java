package main.edu.curso.user_interface.view.condicional;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.condicional.Exercicio10;
import java.util.Scanner;

public class Exercicio10View implements ViewInterface {
    
    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 10",
            "Receba o preço atual e a média mensal de um produto. Calcule e exiba um preço novo, de acordo com as seguintes regras: se a venda mensal for menor que 500, com o preço sendo menor que 30, o novo preço será um acréscimo de 10%; se a venda mensal for maior igual a 500, com o preço sendo maior igual a 30 ou menor que 80, o novo preço será um acréscimo de 15%; se a venda mensal for maior igual a 1000, com o preço sendo maior igual a 80, o novo preço será um decréscimo de 5%. Caso não entre nessas condições, o preço permanecerá igual.",
            "Digite e envie a média mensal, depois o preço atual. \n"
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        float monthlyAverage = scanner.nextFloat();
        float price = scanner.nextFloat();
        Exercicio10 exercicio10 = new Exercicio10();

        return "\n-------------------\n\n" +
            "Resultado: [ R$" + exercicio10.resolve(monthlyAverage, price) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}