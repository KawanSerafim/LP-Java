package main.edu.curso.core.estruturas.logicas.repeticao;

public class Exercicio01 {
    
    public String resolve(int order) {

        if(order == 1) {

            StringBuilder builder = new StringBuilder();

            for(int i = 11; i < 150; i++) {

                builder.append(i + ": ");
                builder.append(i * i);
                builder.append("\n");
            }

            return builder.toString();
        }

        return "O input do usuário não foi reconhecido. Envie 1 para ativar o código.";
    }
}