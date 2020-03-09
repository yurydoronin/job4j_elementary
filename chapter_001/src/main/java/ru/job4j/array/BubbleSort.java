package ru.job4j.array;

/**
 * Class BubbleSort, sorting an array with a BubbleSort method.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 08.03.2019
 */
public class BubbleSort {

    /**
     * Method sort.
     *
     * @param array, int array.
     * @return a sorted array.
     */
    public int[] sort(int[] array) {
        for (int index = 0; index != array.length; index++) {
            for (int next = 1; next != array.length;) {
                if (array[next - 1] > array[next]) {
                    int temp = array[next];
                    array[next] = array[next - 1];
                    array[next - 1] = temp;
                    next++;
                } else {
                    next++;
                }
            }
        }
        return array;
    }
}
