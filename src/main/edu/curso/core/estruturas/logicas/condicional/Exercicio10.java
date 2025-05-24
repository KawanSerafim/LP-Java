package main.edu.curso.core.estruturas.logicas.condicional;

public class Exercicio10 {

    public float resolve(float monthlyAverage, float price) {

        if(monthlyAverage < 500 && price < 30) {

            return (price + (price * (float) 0.10));
        }

        if((monthlyAverage >= 500 && monthlyAverage < 1000) && 
        (price >= 30 && price < 80)) {

            return (price + (price * (float) 0.15));
        }

        if(monthlyAverage >= 1000 && price >= 80) {

            return (price - (price * (float) 0.05));
        }

        return price;
    }
}