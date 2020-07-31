package pt.isel.ls._1920.g08.html.elements;

public class Table extends Element {

    public Table(int borderSize, Element... elements) {
        super("<table border=" + borderSize + ">", elements, "</table>");
    }
}
