package ru.job4j.array;

/**
 * Class MergeSort, the merge sort.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 09.01.2020
 */
public class MergeSort {

    /**
     * Sorts recursively and then merges.
     *
     * @param source, an input array.
     * @param length, an input array's length.
     * @return a sorted input array.
     */
    public static int[] sort(int[] source, int length) {
        if (length < 2) {
            return source;
        }
        int middle = length / 2;
        int[] left = new int[middle];
        int[] right = new int[length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = source[i];
        }
        for (int i = middle; i < length; i++) {
            right[i - middle] = source[i];
        }
        sort(left, middle);
        sort(right, length - middle);
        return merge(source, left, right, middle, length - middle);
    }

    /**
     * Merges two arrays into input array.
     *
     * @param source,      an input array.
     * @param leftArr,     a left sub-array.
     * @param rightArr,    a right sub-array.
     * @param leftLength,  a left sub-array's length.
     * @param rightLength, a right sub-array's length.
     * @return a merged input array.
     */
    public static int[] merge(int[] source, int[] leftArr, int[] rightArr, int leftLength, int rightLength) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftLength && j < rightLength) {
            if (leftArr[i] <= rightArr[j]) {
                source[k++] = leftArr[i++];
            } else {
                source[k++] = rightArr[j++];
            }
        }
        while (i < leftLength) {
            source[k++] = leftArr[i++];
        }
        while (j < rightLength) {
            source[k++] = rightArr[j++];
        }
        return source;
    }
}
