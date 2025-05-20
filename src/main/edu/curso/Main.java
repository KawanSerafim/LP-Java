package main.edu.curso;

import main.edu.curso.user_interface.menus.MainMenu;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        try {

            Scanner scanner = new Scanner(System.in);
            MainMenu menuPrincipal = new MainMenu();
            menuPrincipal.menu(scanner);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }   
}