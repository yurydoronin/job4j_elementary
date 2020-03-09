package ru.job4j.set;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Class UniqueText.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 05.01.2020
 */
public class UniqueText {

    /**
     * Comparing of texts.
     *
     * @param originText,    .
     * @param duplicateText, .
     * @return true if the texts are equal, otherwise false.
     */
    public static boolean isEqual(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>(Arrays.asList(origin));
        for (String word : text) {
            if (!check.contains(word)) {
                result = false;
                break;
            }
        }
        return result;
    }
}