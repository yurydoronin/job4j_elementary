package ru.job4j.calculate;

/**
 * Class Calculator, addition, subtraction, division, multiplying.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 04.03.2019
 */
public class Calculator {
    /**
     * Method add.
     *
     * @param first,  first argument.
     * @param second, second argument.
     * @return first argument plus second argument.
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Method subtract.
     *
     * @param first,  first argument.
     * @param second, second argument.
     * @return second argument subtract first argument.
     */
    public double subtract(double first, double second) {
        return second - first;
    }

    /**
     * Method div.
     *
     * @param first,  first argument.
     * @param second, second argument.
     * @return first argument divide by second argument.
     */
    public double div(double first, double second) {
        return first / second;
    }

    /**
     * Method multiply.
     *
     * @param first,  first argument.
     * @param second, second argument.
     * @return first argument multiply by second argument.
     */
    public double multiply(double first, double second) {
        return first * second;
    }
}