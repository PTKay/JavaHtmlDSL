package pt.isel.ls._1920.g08.html.elements;

public class Option extends ElementText {

    public Option(String value, String text) {
        super("<option value=\"" + value + "\">", text, "</option>");
    }

    public Option(String value, String text, boolean isSelected) {
        super("<option value=\"" + value + "\"" + (isSelected ? "selected>" : ">"),
                text, "</option>");
    }
}
