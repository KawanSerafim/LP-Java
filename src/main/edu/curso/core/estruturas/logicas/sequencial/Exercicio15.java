package main.edu.curso.core.estruturas.logicas.sequencial;

public class Exercicio15 {

    public float resolve(float cathet1, float cathet2) {
        
        cathet1 = (float) Math.pow(cathet1, 2);
        cathet2 = (float) Math.pow(cathet2, 2);
        
        return (float) (Math.sqrt(cathet1 + cathet2));
    }
}