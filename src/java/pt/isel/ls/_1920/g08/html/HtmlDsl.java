package pt.isel.ls._1920.g08.html;

import pt.isel.ls._1920.g08.html.elements.List;
import pt.isel.ls._1920.g08.html.elements.ListElement;
import pt.isel.ls._1920.g08.html.elements.Option;
import pt.isel.ls._1920.g08.html.elements.Paragraph;
import pt.isel.ls._1920.g08.html.elements.Select;
import pt.isel.ls._1920.g08.html.elements.Table;
import pt.isel.ls._1920.g08.html.elements.TableData;
import pt.isel.ls._1920.g08.html.elements.TableDataElement;
import pt.isel.ls._1920.g08.html.elements.TableHeader;
import pt.isel.ls._1920.g08.html.elements.TableRow;
import pt.isel.ls._1920.g08.html.elements.Anchor;
import pt.isel.ls._1920.g08.html.elements.Body;
import pt.isel.ls._1920.g08.html.elements.Break;
import pt.isel.ls._1920.g08.html.elements.Division;
import pt.isel.ls._1920.g08.html.elements.Element;
import pt.isel.ls._1920.g08.html.elements.Form;
import pt.isel.ls._1920.g08.html.elements.H1;
import pt.isel.ls._1920.g08.html.elements.H2;
import pt.isel.ls._1920.g08.html.elements.Head;
import pt.isel.ls._1920.g08.html.elements.HorizontalRule;
import pt.isel.ls._1920.g08.html.elements.Html;
import pt.isel.ls._1920.g08.html.elements.Input;
import pt.isel.ls._1920.g08.html.elements.Label;
import pt.isel.ls._1920.g08.html.elements.Title;
import pt.isel.ls._1920.g08.html.elements.UnorderedList;
import pt.isel.ls._1920.g08.html.utils.Pair;

public class HtmlDsl {
    public static Element html(Element... elements) {
        return new Html(elements);
    }

    public static Element head(Element... elements) {
        return new Head(elements);
    }

    public static Element title(String title) {
        return new Title(title);
    }

    public static Element body(Element... elements) {
        return new Body(elements);
    }

    public static Element body(String font, Element... elements) {
        return new Body(font, elements);
    }

    public static Element h1(String text) {
        return new H1(text);
    }

    public static Element h1(boolean isCentered, String text) {
        return new H1(isCentered, text);
    }

    public static Element h2(String text) {
        return new H2(text);
    }

    public static Element p(String text) {
        return new Paragraph(text);
    }

    public static Element p(String color, String text) {
        return new Paragraph(color, text);
    }

    public static Element p(float fontSizePercentage, String text) {
        return new Paragraph(fontSizePercentage, text);
    }

    public static Element p(float fontSizePercentage, String color, String text) {
        return new Paragraph(fontSizePercentage, color, text);
    }

    public static Element table(Element... elements) {
        return table(1, elements);
    }

    public static Element table(int borderSize, Element... elements) {
        return new Table(borderSize, elements);
    }

    public static Element tr(Element... elements) {
        return new TableRow(elements);
    }

    public static Element th(String header) {
        return new TableHeader(header);
    }

    public static Element td(String data) {
        return new TableData(data);
    }

    public static Element td(int data) {
        return new TableData(Integer.toString(data));
    }

    public static Element td(Element... elements) {
        return new TableDataElement(elements);
    }

    public static Element ul(Element... elements) {
        return new UnorderedList(elements);
    }

    public static Element li(String text) {
        return new List(text);
    }

    public static Element li(Element... elements) {
        return new ListElement(elements);
    }

    public static Element br() {
        return new Break();
    }

    public static Element hr() {
        return new HorizontalRule();
    }

    public static Element a(String href, String text) {
        return new Anchor(href, text);
    }

    public static Element label(String forId, String text) {
        return new Label(forId, text);
    }

    public static Element div(Element... elements) {
        return new Division(elements);
    }

    public static Element form(String method, String path, Element... elements) {
        return new Form(method, path, elements);
    }

    public static Element input(Input.InputType type, Pair<String, String>... attributes) {
        return new Input(type, attributes);
    }

    public static Element select(String name, String id, Element... options) {
        return new Select(name, id, options);
    }

    public static Element option(String value, String text) {
        return new Option(value, text);
    }

    public static Element option(String value, String text, boolean isSelected) {
        return new Option(value, text, isSelected);
    }
}
