package pt.isel.ls._1920.g08.html.elements;

public class Body extends Element {

    public Body(Element... elements) {
        super("<body>", elements, "</body>");
    }

    public Body(String font, Element... elements) {
        super("<body style=\"font-family: " + font + "\">", elements, "</body>");
    }
}
