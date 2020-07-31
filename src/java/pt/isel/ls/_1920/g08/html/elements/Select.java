package pt.isel.ls._1920.g08.html.elements;

public class Select extends Element {

    public Select(String name, String id, Element... options) {
        super("<select name=\"" + name + "\" id=\"" + id + "\">", options, "</select>");
    }
}
