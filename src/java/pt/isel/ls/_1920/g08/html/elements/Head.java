package pt.isel.ls._1920.g08.html.elements;

public class Head extends Element {

    public Head(Element... elements) {
        super("<head>"
                        // Forced meta tag to auto scale website to screen size
                        + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">",
                elements,
                "</head>");
    }
}
