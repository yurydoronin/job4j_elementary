package ru.job4j.array;

/**
 * Class Check, the array is filled out with all true or false.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 07.03.2019
 */
public class Check {

    /**
     * Method mono, compare all elements in the array.
     *
     * @param data, an array.
     * @return true if all elements in the array are equal, otherwise false.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 1; index != data.length; index++) {
            if (data[index - 1] != data[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}