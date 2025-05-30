package main.edu.curso.core.estruturas.logicas.repeticao;

public class Exercicio03 {
    
    public String resolve(int number) {
         
        if(number < 0) {

            return "Não pode número negativo.";
        }

        if(number > 1) {

            float result = 1;

            for(int i = 2; i <= number; i++) {
                
                result += (1 / (float) i);
            }

            return "" + result;
        }

        return "" + 1;
    }
}