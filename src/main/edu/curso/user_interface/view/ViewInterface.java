package main.edu.curso.user_interface.view;

import java.util.Scanner;

public interface ViewInterface {

    public String showContext();
    public String showResult(Scanner scanner);
    public void view(Scanner scanner);
}