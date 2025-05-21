package main.edu.curso.user_interface.view.sequencial;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.sequencial.Exercicio17;
import java.util.Scanner;

public class Exercicio17View implements ViewInterface {

    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 17",
            "Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.",
            "Digite e envie o tempo em horas do percurso, depois a velocidade média: \n"
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        int time = scanner.nextInt();
        int averageSpeed = scanner.nextInt();
        Exercicio17 exercicio17 = new Exercicio17();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio17.resolve(time, averageSpeed) + " litros ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}