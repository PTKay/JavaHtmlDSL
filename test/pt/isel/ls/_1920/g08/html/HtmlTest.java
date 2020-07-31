package pt.isel.ls._1920.g08.html;

import org.junit.Test;
import pt.isel.ls._1920.g08.html.elements.Element;

import static org.junit.Assert.assertEquals;
import static pt.isel.ls._1920.g08.html.HtmlDsl.body;
import static pt.isel.ls._1920.g08.html.HtmlDsl.h1;
import static pt.isel.ls._1920.g08.html.HtmlDsl.head;
import static pt.isel.ls._1920.g08.html.HtmlDsl.html;
import static pt.isel.ls._1920.g08.html.HtmlDsl.p;
import static pt.isel.ls._1920.g08.html.HtmlDsl.table;
import static pt.isel.ls._1920.g08.html.HtmlDsl.td;
import static pt.isel.ls._1920.g08.html.HtmlDsl.th;
import static pt.isel.ls._1920.g08.html.HtmlDsl.title;
import static pt.isel.ls._1920.g08.html.HtmlDsl.tr;

public class HtmlTest {

    @Test
    public void createBasicHtmlTest() {
        final String expected =
                "<!DOCTYPE html>\n"
                        + "<html>\n"
                        +   "\t<head>"
                        +       "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                        +       "\t\t<title>The title</title>\n"
                        +   "\t</head>\n"
                        +   "\t<body>\n"
                        +       "\t\t<h1>This is a section</h1>\n"
                        +       "\t\t<p>This is a paragraph</p>\n"
                        +   "\t</body>\n"
                        + "</html>";

        Element actual =
                html(
                        head(
                                title("The title")
                        ),
                        body(
                                h1("This is a section"),
                                p("This is a paragraph")
                        )
                );

        assertEquals(expected, actual.toString());
    }

    @Test
    public void createHtmlTableTest() {
        final String expected =
                "<!DOCTYPE html>\n"
                        + "<html>\n"
                        + "\t<head>"
                        + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                        + "\t\t<title>The title</title>\n"
                        + "\t</head>\n"
                        + "\t<body>\n"
                        + "\t\t<h1>Table:</h1>\n"
                        + "\t\t<table border=1>\n"
                        + "\t\t\t<tr>\n"
                        + "\t\t\t\t<th>ID</th>\n"
                        + "\t\t\t\t<th>Name</th>\n"
                        + "\t\t\t</tr>\n"
                        + "\t\t\t<tr>\n"
                        + "\t\t\t\t<td>1</td>\n"
                        + "\t\t\t\t<td>Meeting Room</td>\n"
                        + "\t\t\t</tr>\n"
                        + "\t\t\t<tr>\n"
                        + "\t\t\t\t<td>2</td>\n"
                        + "\t\t\t\t<td>Lunch Room</td>\n"
                        + "\t\t\t</tr>\n"
                        + "\t\t</table>\n"
                        + "\t</body>\n"
                        + "</html>";

        Element actual =
                html(
                        head(
                                title("The title")
                        ),
                        body(
                                h1("Table:"),
                                table(
                                        tr(
                                                th("ID"),
                                                th("Name")
                                        ),
                                        tr(
                                                td("1"),
                                                td("Meeting Room")
                                        ),
                                        tr(
                                                td("2"),
                                                td("Lunch Room")
                                        )
                                )
                        )
                );

        assertEquals(expected, actual.toString());
    }

    @Test
    public void concatenateHtmlTest() {
        final String expected =
                "<!DOCTYPE html>\n"
                        + "<html>\n"
                        + "\t<head>"
                        + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                        + "\t\t<title>The title</title>\n"
                        + "\t</head>\n"
                        + "\t<body>\n"
                        + "\t\t<table border=1>\n"
                        + "\t\t\t<tr>\n"
                        + "\t\t\t\t<th>ID</th>\n"
                        + "\t\t\t\t<th>Name</th>\n"
                        + "\t\t\t\t<th>Description</th>\n"
                        + "\t\t\t\t<th>Capacity</th>\n"
                        + "\t\t\t</tr>\n"
                        + "\t\t\t<tr>\n"
                        + "\t\t\t\t<td>1</td>\n"
                        + "\t\t\t\t<td>Meeting Room</td>\n"
                        + "\t\t\t\t<td>Meeting Room on CCISEL</td>\n"
                        + "\t\t\t\t<td>16</td>\n"
                        + "\t\t\t</tr>\n"
                        + "\t\t\t<tr>\n"
                        + "\t\t\t\t<td>1</td>\n"
                        + "\t\t\t\t<td>Meeting Room</td>\n"
                        + "\t\t\t\t<td>Meeting Room on CCISEL</td>\n"
                        + "\t\t\t\t<td>16</td>\n"
                        + "\t\t\t</tr>\n"
                        + "\t\t</table>\n"
                        + "\t</body>\n"
                        + "</html>";

        Element tableRow = tr();
        tableRow.addChild(th("ID"));
        tableRow.addChild(th("Name"));
        tableRow.addChild(th("Description"));
        tableRow.addChild(th("Capacity"));

        Element table = table();
        table.addChild(tableRow);
        for (int i = 0; i < 2; ++i) {
            Element tableRowData = tr();
            tableRowData.addChild(td("1"));
            tableRowData.addChild(td("Meeting Room"));
            tableRowData.addChild(td("Meeting Room on CCISEL"));
            tableRowData.addChild(td("16"));
            table.addChild(tableRowData);
        }

        Element actual =
                html(
                        head(
                                title("The title")
                        ),
                        body(
                                table
                        )
                );

        assertEquals(expected, actual.toString());
    }
}