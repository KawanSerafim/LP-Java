package main.edu.curso.core.estruturas.logicas.repeticao;

public class Exercicio05 {
    
    public String resolve(int number1, int number2) {

        if(number1 == number2) {

            return "Os números possuem valores iguais.";
        }

        int result = 0;

        if(number1 > number2) {

            for(int i = (number2 + 1); i < number1; i++) {

                if((i % 2) == 1) {

                    result += i;
                }
            }
            
            return result + "";
        }

        for(int i = (number1 + 1); i < number2; i++) {

            if((i % 2) == 1) {

                result += i;
            }
        }

        return result + "";
    }
}