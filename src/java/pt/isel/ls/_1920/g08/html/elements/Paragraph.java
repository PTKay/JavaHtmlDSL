package pt.isel.ls._1920.g08.html.elements;

public class Paragraph extends ElementText {

    public Paragraph(String text) {
        super("<p>", text, "</p>");
    }

    public Paragraph(float fontSizePercentage, String text) {
        super("<p style=\"font-size:" + fontSizePercentage + "%;\">",
                text, "</p>");
    }

    public Paragraph(String color, String text) {
        super("<p style=\"color:" + color + ";\">",
                text, "</p>");
    }

    public Paragraph(float fontSizePercentage, String color, String text) {
        super("<p style=\"color:" + color + ";font-size:" + fontSizePercentage + "%;\">",
                text, "</p>");
    }
}
