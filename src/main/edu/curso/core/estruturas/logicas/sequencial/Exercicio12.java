package main.edu.curso.core.estruturas.logicas.sequencial;

public class Exercicio12 {
    public String resolve(int anoNasc, int anoAtual) {
        int idade = anoAtual - anoNasc;
        return "Idade: " + idade + " anos | Daqui 17 anos: " + (idade + 17) + " anos";
    }   
}