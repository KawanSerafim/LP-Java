package main.edu.curso.core.estruturas.logicas.sequencial;

public class Exercicio05 {
    public String resolucao(int a, int b, int c) {
        double delta = ((Math.pow(b, 2)) - 4 * a * c);
        double r1 = ((-(b) + Math.sqrt(delta)) / (2 * a));
        double r2 = ((-(b) - Math.sqrt(delta)) / (2 * a));
        
        return "Raiz 1: " + r1 + " | Raiz 2: " + r2;
    }
}