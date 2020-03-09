package ru.job4j.array;

/**
 * Class FindLoop, finding a specific element in the present array.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 07.03.2019
 */
public class FindLoop {

    /**
     * Method indexOf.
     *
     * @param data, an array of int elements.
     * @param el,   an element, which we are looking for.
     * @return a found element or -1.
     */
    public int indexOf(int[] data, int el) {
        int result = -1;
        for (int index = 0; index != data.length; index++) {
            if (data[index] == el) {
                result = index;
                break;
            }
        }
        return result;
    }
}
