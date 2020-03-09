package ru.job4j.condition;

/**
 * Class Point, counting a distance between two points in the coordinate system.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 05.03.2019
 */
public class Point {

    private int x;

    private int y;

    /**
     * A constructor.
     *
     * @param first,  x.
     * @param second, y.
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Method distance.
     *
     * @param that, a point.
     * @return first argument plus second argument.
     */
    public double distance(Point that) {
        return Math.sqrt(Math.pow(that.x - this.x, 2) + Math.pow(that.y - this.y, 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
}
