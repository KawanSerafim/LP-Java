package main.edu.curso.user_interface.menus;

public class BuildMenu {

    private String titulo;
    private String[] opcoes;

    public BuildMenu(String titulo, String[] opcoes) {
        this.titulo = titulo;
        this.opcoes = opcoes;
    }

    private String buildMenu() {

        StringBuilder builder = new StringBuilder();

        builder.append("\n\n[" + titulo + "]\n\n");

        for(int i = 0; i < opcoes.length; i++) {
            builder.append((i+1) + ": " + opcoes[i] + "\n");
        }

        builder.append(
            "0: Sair.\n\n" +
            "R: "
        );

        return builder.toString();

    }

    public String displayMenu() {
        return buildMenu().toString();
    }
}