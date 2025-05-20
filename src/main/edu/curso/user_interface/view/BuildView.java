package main.edu.curso.user_interface.view;

public class BuildView {
    
    private String title;
    private String text;
    private String order;

    public BuildView(String title, String text, String order) {

        this.title = title;
        this.text = text;
        this.order = order;
    }

    private String buildView() {

        StringBuilder builder = new StringBuilder();
        builder.append("\n\n-------------------");
        builder.append("\n\n[" + title + "]\n\n");
        builder.append(text);
        builder.append("\n\n" + order);

        return builder.toString();
    }

    public String displayView() {

        return buildView();
    }
}