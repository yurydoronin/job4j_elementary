package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Class ConvertMatrix2List, .
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 24.04.2019
 */
public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] element : array) {
            for (int value : element) {
                list.add(value);
            }
        }
        return list;
    }
}
