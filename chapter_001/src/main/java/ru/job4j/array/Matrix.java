package ru.job4j.array;

/**
 * Class Matrix, a multiplication table.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 08.03.2019
 */
public class Matrix {

    /**
     * Method multiple.
     *
     * @param size, an array size.
     * @return a multiplication table.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int index = 0; index != size; index++) {
            for (int cell = 0; cell != size; cell++) {
                table[index][cell] = (index + 1) * (cell + 1);
            }
        }
        return table;
    }
}
