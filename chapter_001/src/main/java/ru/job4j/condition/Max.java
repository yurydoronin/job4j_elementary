package ru.job4j.condition;

/**
 * Class Max, finding a maximum from two numbers.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 05.03.2019
 */
public class Max {

    /**
     * Method max.
     *
     * @param left,  first argument.
     * @param right, second argument.
     * @return maximum from two numbers.
     */
    public int max(int left, int right) {
        return left > right ? left : right;
    }
}
