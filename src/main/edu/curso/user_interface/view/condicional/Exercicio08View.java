package main.edu.curso.user_interface.view.condicional;

import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.core.estruturas.logicas.condicional.Exercicio08;
import java.util.Scanner;

public class Exercicio08View implements ViewInterface {

    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 08",
            "Receba a hora de início e de final de um jogo em horas e minutos. Calcule e exiba o tempo do jogo, sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro. Nota: minutos devem ser inseridos até o valor 59.",
            "Digite e envie a hora inicial, depois minuto inicial, depois hora final, e por fim minuto final: \n"
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        int startHour = scanner.nextInt();
        int startMinute = scanner.nextInt();
        int finalHour = scanner.nextInt();
        int finalMinute = scanner.nextInt();
        Exercicio08 exercicio08 = new Exercicio08();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio08.resolve(startHour, startMinute, finalHour, finalMinute) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}