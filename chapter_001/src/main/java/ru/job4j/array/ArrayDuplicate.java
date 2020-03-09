package ru.job4j.array;

import java.util.Arrays;

/**
 * Class ArrayDuplicate, removing duplicates from the array.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 08.03.2019
 */
public class ArrayDuplicate {

    /**
     * Method remove.
     *
     * @param array, an array of Strings.
     * @return an array without duplicates.
     */
    public String[] remove(String[] array) {
        int duplicates = 0;
        for (int index = 0; index < array.length - 1 - duplicates; index++) {
            for (int next = index + 1; next < array.length - 1 - duplicates;) {
                if (array[index] != null && array[index].length() != 0) {
                    if (array[index].equals(array[next])) {
                        String temp = array[next];
                        array[next] = array[array.length - 1 - duplicates];
                        array[array.length - 1 - duplicates] = temp;
                        duplicates += 1;
                        next++;
                    } else {
                        next++;
                    }
                }
            }
        }
        return Arrays.copyOf(array, array.length - duplicates);
    }
}
