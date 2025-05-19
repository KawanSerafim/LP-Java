package main.edu.curso.user_interface;

import main.edu.curso.user_interface.menus.MainMenu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            MainMenu menuPrincipal = new MainMenu();
            Scanner scanner = new Scanner(System.in);

            menuPrincipal.menu(scanner);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }   
}