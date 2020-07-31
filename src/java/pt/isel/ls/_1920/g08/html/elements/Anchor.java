package pt.isel.ls._1920.g08.html.elements;

public class Anchor extends ElementText {

    public Anchor(String href, String text) {
        super("<a href=" + href + ">", text, "</a>");
    }
}
