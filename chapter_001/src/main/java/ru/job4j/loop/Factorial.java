package ru.job4j.loop;

/**
 * Class Factorial, counting the factorial.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 05.03.2019
 */
public class Factorial {

    /**
     * Method calc, the multiplication of each number by each next number in a range.
     *
     * @param n, any number from 0 to n.
     * @return the product of all numbers in a range.
     */
    public int calc(int n) {
        int result = 1;
        if (n != 0) {
            for (int index = 1; index <= n; index++) {
                result = result * index;
            }
            return result;
        }
        return result;
    }
}
