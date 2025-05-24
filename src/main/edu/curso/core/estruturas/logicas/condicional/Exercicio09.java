package main.edu.curso.core.estruturas.logicas.condicional;

public class Exercicio09 {
 
    public String resolve(int number1, int number2) {

        if(number1 > number2 && (number1 % number2) == 0){

            return "O maior: \"" + number1 + "\", é múltiplo do menor: \"" + number2 + "\"";
        }

        if(number2 > number1 && (number2 % number1) == 0) {

            return "O maior: \"" + number2 + "\", é múltiplo do menor: \"" + number1 + "\"";
        }

        return "O maior não é múltiplo do menor.";
    }
}