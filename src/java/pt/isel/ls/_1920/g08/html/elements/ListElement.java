package pt.isel.ls._1920.g08.html.elements;

public class ListElement extends Element {

    public ListElement(Element... elements) {
        super("<li>", elements, "</li>");
    }
}
