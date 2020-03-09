package ru.job4j.array;

/**
 * Class MatrixCheck, a square array which is filled with "true" of "false" diagonally.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 5.0
 * @since 08.03.2019
 */
public class MatrixCheck {

    /**
     * Method mono.
     *
     * @param data, an array.
     * @return true if the diagonals are equal, otherwise false.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int index = 1; index != data.length; index++) {
            if (data[index - 1][index - 1] != data[index][index]) {
                result = false;
                break;
            }
            if (data[index - 1][data.length - 1 - (index - 1)] != data[index][data.length - 1 - index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}