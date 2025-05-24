package main.edu.curso.core.estruturas.logicas.condicional;

public class Exercicio11 {
    
    public String resolve(int investmentType, float investment) {

        if(investmentType == 1) {

            return "" + (investment + (investment * (float) 0.03));
        }

        if(investmentType == 2) {

            return "" + (investment + (investment * (float) 0.05));
        }

        return "O tipo de investimento fornecido não está sendo considerado.";
    }
}