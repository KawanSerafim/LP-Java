package main.edu.curso.core.estruturas.logicas.repeticao;

public class Exercicio02 {

    public int resolve(int number) {

        if(number < 0) {

            return 0;
        }

        if(number > 0) {

            int factorial = 1;

            for(int i = 1; i <= number; i++) {

                factorial *= i;
            }

            return factorial;
        }

        return 1;
    }
}