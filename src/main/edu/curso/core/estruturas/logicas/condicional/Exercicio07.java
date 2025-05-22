package main.edu.curso.core.estruturas.logicas.condicional;

public class Exercicio07 {
    
    public String resolve(int value) {

        if(((value % 2) == 0) && ((value % 3) == 0)) {
            return "O valor " + value + " é divisível por 2 e 3";
        }

        return "O valor " + value + " não divisível por 2 ou 3";
    }
}