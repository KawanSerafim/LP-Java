package main.edu.curso.user_interface.menus.logicas;

import main.edu.curso.user_interface.menus.MenuInterface;
import java.util.Scanner;

public class CondicionalMenu implements MenuInterface{

    @Override
    public void showMenu() {
        
        String[] options = {

        };
    }

    @Override
    public void choiceMenu(Scanner scanner) {
        
    }

    @Override
    public void menu(Scanner scanner) {
        showMenu();
        choiceMenu(scanner);
    }
}