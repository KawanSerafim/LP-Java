package main.edu.curso.core.estruturas.logicas.sequencial;

public class Exercicio16 {

    public float resolve(int hoursWorked, float hourlyRate, float discountPercentage, int descendantsNumber) {
        
        discountPercentage /= 100;
        float grossSalary = hoursWorked * hourlyRate;

        return (grossSalary - (grossSalary * discountPercentage)) + (descendantsNumber * 100);
    }
}