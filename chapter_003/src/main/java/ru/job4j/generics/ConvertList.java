package ru.job4j.generics;

import java.util.LinkedList;
import java.util.List;

/**
 * Class ConvertList, .
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 24.04.2019
 */
public class ConvertList {

    /**
     * Method convert .
     *
     * @param list, .
     * @return .
     */
    public List<Integer> convert(List<int[]> list) {
        List<Integer> result = new LinkedList<>();
        for (int[] array : list) {
            for (int element : array) {
                result.add(element);
            }
        }
        return result;
    }
}
