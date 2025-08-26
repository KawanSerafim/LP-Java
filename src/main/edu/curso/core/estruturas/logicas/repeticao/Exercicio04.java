package main.edu.curso.core.estruturas.logicas.repeticao;

public class Exercicio04 {

    public String resolve(int number) {

        StringBuilder builder = new StringBuilder("\n");

        for(int i = 1; i < 11; i++) {

            builder.append(number + " x " + i + " = ");
            builder.append((number * i) + "\n");
        }

        return builder.toString();
    }
}