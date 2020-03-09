package ru.job4j.sort;

import java.util.Comparator;

/**
 * Class ListCompare, compares the strings and letters of theirs.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 27.03.2019
 */
public class ListCompare implements Comparator<String> {

    /**
     * Comparing the strings and letters of theirs.
     *
     * @param left,  a string.
     * @param right, a string.
     * @return int, -1, 1 or 0 if a left string or a letter less,
     * greater or equal than a right string or a letter.
     */
    @Override
    public int compare(String left, String right) {
        int result = 0;
        int length = Math.min(left.length(), right.length());
        for (int index = 0; index != length; index++) {
            result = Character.compare(left.charAt(index), right.charAt(index));
            if (!(result == 0)) {
                break;
            }
        }
        if (result == 0) {
            result = Integer.compare(left.length(), right.length());
        }
        return result;
    }
}
