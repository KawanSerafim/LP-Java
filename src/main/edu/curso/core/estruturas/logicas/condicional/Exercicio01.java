package main.edu.curso.core.estruturas.logicas.condicional;

public class Exercicio01 {
    
    public int resolve(int value1, int value2) {

        if(value2 > value1) {
            
            return (value2 - value1);
        }

        return value1 - value2;
    }
}