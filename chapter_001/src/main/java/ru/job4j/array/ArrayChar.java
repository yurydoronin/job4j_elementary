package ru.job4j.array;

/**
 * Class ArrayChar, checking the word begins with prefix.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 08.03.2019
 */
public class ArrayChar {

    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Method startWith, checking the word begins with prefix.
     *
     * @param prefix, a prefix.
     * @return true if the word begins with prefix, otherwise false.
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int index = 0; index != value.length; index++) {
            if (value[index] != data[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
