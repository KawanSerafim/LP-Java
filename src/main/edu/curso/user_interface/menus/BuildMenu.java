package main.edu.curso.user_interface.menus;

public class BuildMenu {

    private String title;
    private String[] options;

    public BuildMenu(String title, String[] options) {

        this.title = title;
        this.options = options;
    }

    private String buildMenu() {

        StringBuilder builder = new StringBuilder();
        builder.append("\n\n-------------------");
        builder.append("\n\n[" + title + "]\n\n");

        for(int i = 0; i < options.length; i++) {

            builder.append((i+1) + ": " + options[i] + "\n");
        }

        builder.append(
            "0: Sair.\n\n" +
            "R: "
        );

        return builder.toString();
    }

    public String displayMenu() {
        
        return buildMenu();
    }
}