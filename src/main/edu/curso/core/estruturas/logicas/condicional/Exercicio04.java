package main.edu.curso.core.estruturas.logicas.condicional;

public class Exercicio04 {
 
    public String resolve(float grade1, float grade2, float grade3, float grade4) {

        float avarege = ((grade1 + grade2 + grade3 + grade4) / 4);

        if(avarege < 3) {
            return "Média: " + avarege + " | Situação: Retido.";
        }

        if(avarege >= 3 && avarege < 6) {
            return "Média: " + avarege + " | Situação: Em exame.";
        }

        return "Média: " + avarege + " | Situação: Aprovado";
    }
}