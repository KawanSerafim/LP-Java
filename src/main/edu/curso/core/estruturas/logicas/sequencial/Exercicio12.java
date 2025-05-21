package main.edu.curso.core.estruturas.logicas.sequencial;

public class Exercicio12 {
    
    public String resolve(int birthYear, int nowYear) {

        int age = nowYear - birthYear;
        
        return "Idade: " + age + " anos | Daqui 17 anos: " + (age + 17) + " anos";
    }   
}