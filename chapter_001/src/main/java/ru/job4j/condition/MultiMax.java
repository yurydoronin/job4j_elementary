package ru.job4j.condition;

/**
 * Class MultiMax, finding a maximum from three numbers.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 05.03.2019
 */
public class MultiMax {

    /**
     * Method max.
     *
     * @param first,  first argument.
     * @param second, second argument.
     * @param third,  third argument.
     * @return maximum from three numbers.
     */
    public int max(int first, int second, int third) {
        int result = max(second, third);

        return result > first ? result : first;
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }
}

