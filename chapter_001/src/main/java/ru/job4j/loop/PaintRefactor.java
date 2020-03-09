package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * Class Paint, building a pyramid in pseudo-graphics.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 07.03.2019
 */
public class PaintRefactor {

    /**
     * Method rightTrl.
     *
     * @param height, a triangle's height.
     * @return string contains symbols "^" and spaces " ".
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    /**
     * Method leftTrl.
     *
     * @param height, a triangle's height.
     * @return string contains symbols "^" and spaces " ".
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * Method pyramid.
     *
     * @param height, a pyramid's height.
     * @return string contains symbols "^" and spaces " ".
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    /**
     * Method loopBy.
     *
     * @param height,  a pyramid's height.
     * @param width,   a pyramid's width.
     * @param predict, an interface.
     * @return string contains symbols "^" and spaces " ".
     */
    private String loopBy(int height, int width, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
