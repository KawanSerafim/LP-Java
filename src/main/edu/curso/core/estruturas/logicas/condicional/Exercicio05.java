package main.edu.curso.core.estruturas.logicas.condicional;

public class Exercicio05 {

    public String resolve(int value1, int value2) {

        if(value2 < value1) {
            
            return "Valor 2: " + value2 + " | Valor 1: " + value1;
        }

        return "Valor 1: " + value1 + " | Valor 2: " + value2;
    }
}