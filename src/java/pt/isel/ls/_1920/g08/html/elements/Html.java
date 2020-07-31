package pt.isel.ls._1920.g08.html.elements;

public class Html extends Element {

    public Html(Element... elements) {
        super("<!DOCTYPE html>\n<html>", elements, "</html>");
    }
}
