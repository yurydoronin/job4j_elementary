package ru.job4j.array;

/**
 * Class Square, filling an array with squared numbers.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 07.03.2019
 */
public class Square {

    /**
     * Method calculate.
     *
     * @param bound, any number.
     * @return an array filled with int elements squared.
     */
    public int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int index = 0; index != bound; index++) {
            int count = index + 1;
            result[index] = (int) Math.pow(count, 2);
        }
        return result;
    }
}
