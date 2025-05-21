package main.edu.curso.core.estruturas.logicas.sequencial;

public class Exercicio06 {
    
    public String resolve(float valueX, float valueY) {
        
        float tmpValue = valueX;
        valueX = valueY;
        valueY = tmpValue;

        return "Valor X: " + valueX + " | Valor Y: " + valueY;
    }
}