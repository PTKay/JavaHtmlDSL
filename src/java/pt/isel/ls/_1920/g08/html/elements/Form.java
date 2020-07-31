package pt.isel.ls._1920.g08.html.elements;

public class Form extends Element {

    public Form(String method, String path, Element... elements) {
        super("<form method=\"" + method + "\" action=\"" + path + "\">",
                elements,
                "</form>");
    }
}
