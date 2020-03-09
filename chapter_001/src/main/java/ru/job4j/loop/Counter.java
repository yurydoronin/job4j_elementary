package ru.job4j.loop;

/**
 * Class Counter, counting the sum of even numbers in a range.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 05.03.2019
 */
public class Counter {

    /**
     * Method add.
     *
     * @param start,  first argument.
     * @param finish, second argument.
     * @return the sum of even numbers.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                sum += index;
            }
        }
        return sum;
    }
}
