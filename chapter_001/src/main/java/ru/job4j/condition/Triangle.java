package ru.job4j.condition;

/**
 * Class Triangle, counting a triangle's area.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 05.03.2019
 */
public class Triangle {

    /**
     *
     */
    private Point first;

    /**
     *
     */
    private Point second;

    /**
     *
     */
    private Point third;

    /**
     * @param a, .
     * @param b, .
     * @param c, .
     */
    public Triangle(Point a, Point b, Point c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    /**
     * Method period, counting a semi-perimeter by sides lengths.
     *
     * @param a, the distance between points a and b.
     * @param b, the distance between points a and c.
     * @param c, the distance between points b and c.
     * @return a triangle's semi-perimeter.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Method area.
     * The Heron's formula, a square root of p * (p - ab) * (p - ac) * (p - bc);
     *
     * @return the triangle's area, otherwise -1.
     */
    public double area() {
        double abc = -1;
        double a = this.first.distance(this.second);
        double b = this.second.distance(this.third);
        double c = this.first.distance(this.third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            abc = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return abc;
    }

    /**
     * Method exist, checking if a triangle can be build with the present sides.
     *
     * @param a, the distance between points a and b.
     * @param b, the distance between points a and c.
     * @param c, the distance between points b and c.
     * @return true or false;
     */
    private boolean exist(double a, double c, double b) {
        return (a < (c + b) || b < (a + c) || c < (a + b));
    }
}

