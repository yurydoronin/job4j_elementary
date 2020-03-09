package ru.job4j.list;

import java.util.List;

/**
 * Class ConvertList2Array, converts the List to two dimensional array.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 24.04.2019
 */
public class ConvertList2Array {

    /**
     * Converting the List to two dimensional array.
     *
     * @param list, a collection.
     * @param rows, rows in two dimensional array.
     * @return two dimensional array.
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = list.size() % rows == 0 ? list.size() / rows : (list.size() / rows) + 1;
        int i = 0;
        int j = 0;
        int[][] array = new int[rows][cells];
        for (Integer element : list) {
            if (j < cells) {
                array[i][j++] = element;
            } else {
                i++;
                j = 0;
                array[i][j++] = element;
            }
        }
        return array;
    }
}
