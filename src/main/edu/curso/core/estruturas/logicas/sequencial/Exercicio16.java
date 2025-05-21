package main.edu.curso.core.estruturas.logicas.sequencial;

public class Exercicio16 {
    public float resolve(int hTrabalhadas, float vHora, float desconto, int nDescendentes) {
        desconto /= 100;
        float salarioBruto = hTrabalhadas * vHora;

        return (salarioBruto - (salarioBruto * desconto)) + (nDescendentes * 100);
    }
}