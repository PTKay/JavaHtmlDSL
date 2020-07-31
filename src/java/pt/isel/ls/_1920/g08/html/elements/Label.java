package pt.isel.ls._1920.g08.html.elements;

public class Label extends ElementText {

    public Label(String forId, String text) {
        super("<label for=\"" + forId + "\">", text, "</label>");
    }
}
