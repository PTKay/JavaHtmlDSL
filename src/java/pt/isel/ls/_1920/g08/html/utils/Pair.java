package pt.isel.ls._1920.g08.html.utils;

/**
 * Class used to store a Pair of values
 * @param <E> The type of the first value
 * @param <F> The type of second value
 */
public class Pair<E,F> {
    public E first;
    public F second;

    public Pair(E first, F second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return first + " " + second;
    }
}
