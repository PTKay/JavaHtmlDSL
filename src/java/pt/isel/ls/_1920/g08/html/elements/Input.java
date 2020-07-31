package pt.isel.ls._1920.g08.html.elements;

import pt.isel.ls._1920.g08.html.utils.Pair;

public class Input extends ElementText {

    public enum InputType {
        TEXT,
        DATETIME_LOCAL,
        TIME,
        SUBMIT,
        CHECKBOX,
        NUMBER,
    }

    // Static method to construct input attributes as Pair objects
    public static Pair<String, String> attrib(String attribute, String value) {
        return new Pair<>(attribute, value);
    }

    public Input(InputType type, Pair<String, String>... attributes) {
        super("<input type=\"" + getTypeName(type) + "\" " + getAttributes(attributes),
                "", "/>");
    }

    private static String getAttributes(Pair<String, String>[] attributes) {
        StringBuilder builder = new StringBuilder();
        for (Pair<String, String> pair: attributes) {
            builder.append(pair.first);
            builder.append("=\"");
            builder.append(pair.second);
            builder.append("\" ");
        }
        return builder.toString();
    }

    private static String getTypeName(InputType type) {
        return type.toString().toLowerCase().replace('_', '-');
    }
}
