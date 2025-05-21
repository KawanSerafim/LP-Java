package main.edu.curso.core.estruturas.logicas.sequencial;

public class Exercicio05 {
    
    public String resolve(int coefficientA, int coefficientB, int coefficientC) {
        
        double delta = ((Math.pow(coefficientB, 2)) - 4 * coefficientA * coefficientC);
        double x1 = ((-(coefficientB) + Math.sqrt(delta)) / (2 * coefficientA));
        double x2 = ((-(coefficientB) - Math.sqrt(delta)) / (2 * coefficientA));
        
        return "Raiz 1: " + x1 + " | Raiz 2: " + x2;
    }
}