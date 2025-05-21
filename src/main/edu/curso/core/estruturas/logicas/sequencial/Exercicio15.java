package main.edu.curso.core.estruturas.logicas.sequencial;

public class Exercicio15 {
    public float resolve(float cateto1, float cateto2) {
        cateto1 = (float) Math.pow(cateto1, 2);
        cateto2 = (float) Math.pow(cateto2, 2);
        return (float) (Math.sqrt(cateto1 + cateto2));
    }
}