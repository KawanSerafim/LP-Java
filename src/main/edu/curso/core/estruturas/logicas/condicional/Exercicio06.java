package main.edu.curso.core.estruturas.logicas.condicional;

public class Exercicio06 {
    
    public String resolve(float value1, float value2, float value3, float value4) {

        if(value4 < value1) {
            return value4 + ", " + value1 + ", " + value2 + ", " + value3;
        }

        if(value4 < value2) {
            return value1 + ", " + value4 + ", " + value2 + ", " + value3;
        }

        if(value4 < value3) {
            return value1 + ", " + value2 + ", " + value4 + ", " + value3;
        }

        return value1 + ", " + value2 + ", " + value3 + ", " + value4;
    }
}