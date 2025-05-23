package main.edu.curso.core.estruturas.logicas.condicional;

public class Exercicio08 {
    
    public String resolve(int startHour, int startMinute, int finalHour, int finalMinute) {


        if(startMinute > 59 || finalMinute > 59) {

            return "Erro! O limite para minutos é 59.";
        }

        if(startHour > finalHour) {

            finalHour += 24;
        }

        if(startMinute > finalMinute) {

            finalMinute += 60;
        }

        int hour = finalHour - startHour;
        int minute = finalMinute - startMinute;
        
        return hour + " hora(s) e " + minute + " minuto(s).";
    }
}