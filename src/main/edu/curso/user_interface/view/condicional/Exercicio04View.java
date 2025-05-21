package main.edu.curso.user_interface.view.condicional;

import main.edu.curso.user_interface.view.BuildView;
import main.edu.curso.user_interface.view.ViewInterface;
import main.edu.curso.core.estruturas.logicas.condicional.Exercicio04;
import java.util.Scanner;

public class Exercicio04View implements ViewInterface {
    
    @Override
    public String showContext() {
        
        BuildView buildView = new BuildView(
            "EXERCÍCIO 4",
            "Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. `Aprovado` para média >= 6, `Em exame` para média >= 3 e < 6, e `Retido` para média < 3.",
            "Digite e envie a primeira nota, depois a segunda, depois a terceira, e por fim a quarta: \n"
        );

        return buildView.displayView();
    }

    @Override
    public String showResult(Scanner scanner) {
        
        float grade1 = scanner.nextInt();
        float grade2 = scanner.nextInt();
        float grade3 = scanner.nextInt();
        float grade4 = scanner.nextInt();
        Exercicio04 exercicio04 = new Exercicio04();

        return "\n-------------------\n\n" +
            "Resultado: [ " + exercicio04.resolve(grade1, grade2, grade3, grade4) + " ]";
    }

    @Override
    public void view(Scanner scanner) {
        
        System.out.print(showContext());
        System.out.print(showResult(scanner));
    }
}