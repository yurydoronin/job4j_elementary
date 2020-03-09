package ru.job4j.array;

/**
 * Class Turn, the inversion of the array.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 07.03.2019
 */
public class Turn {

    /**
     * Method back.
     *
     * @param array, an array.
     * @return an inverted array.
     */
    public int[] back(int[] array) {
        for (int index = 0; index != array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;
        }
        return array;
    }
}

