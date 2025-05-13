package main.edu.curso.backend.estruturas.logicas.sequencial;

public class Exercicio16 {
    public float resolucao(int hTrabalhadas, float vHora, float desconto, int nDescendentes) {
        desconto /= 100;
        float salarioBruto = hTrabalhadas * vHora;

        return (salarioBruto - (salarioBruto * desconto)) + (nDescendentes * 100);
    }
}