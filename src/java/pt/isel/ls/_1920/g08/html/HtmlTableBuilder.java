package pt.isel.ls._1920.g08.html;

import pt.isel.ls._1920.g08.html.elements.Element;
import pt.isel.ls._1920.g08.html.utils.Pair;

import java.util.LinkedList;
import java.util.function.Function;

public class HtmlTableBuilder<T> {

    private Iterable<T> rowData;
    private LinkedList<Pair<String, Function<T, Object>>> columns = new LinkedList<>();

    public HtmlTableBuilder(Iterable<T> rowData) {
        this.rowData = rowData;
    }

    public HtmlTableBuilder<T> withColumn(String name, Function<T, Object> dataFunction) {
        columns.add(new Pair<>(name, dataFunction));
        return this;
    }

    /**
     * Builds a Table Element.
     * Each column contains a Pair of a String and a Function of a generic and an Object.
     * The String is used to represent the column name while the Function is used to get each row's content
     */
    public Element build() {
        Element table = HtmlDsl.table();
        Element tableHeaders = HtmlDsl.tr();

        columns.forEach(column -> tableHeaders.addChild(HtmlDsl.th(column.first)));
        table.addChild(tableHeaders);

        for (T row : rowData) {
            Element tableRowData = HtmlDsl.tr();
            columns.forEach(column -> tableRowData.addChild(HtmlDsl.td(column.second.apply(row).toString())));
            table.addChild(tableRowData);
        }

        return table;
    }
}
