package main.edu.curso.backend.estruturas.logicas.sequencial;

public class Exercicio06 {
    public String resolucao(float valorX, float valorY) {
        float valorTmp = valorX;
        valorX = valorY;
        valorY = valorTmp;

        return "Valor X: " + valorX + " | Valor Y: " + valorY;
    }
}