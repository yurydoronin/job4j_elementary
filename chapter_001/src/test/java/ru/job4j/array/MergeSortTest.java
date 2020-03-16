package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 09.01.2020
 */
public class MergeSortTest {

    /**
     * Test sort & merge.
     */
    @Test
    public void whenThen() {
        int[] sourceEven = {5, 2, 4, 6, 1, 3, 2, 6};
        int[] expectedEven = {1, 2, 2, 3, 4, 5, 6, 6};
        int[] sourceOdd = {5, 2, 4, 6, 1, 3, 2};
        int[] expectedOdd = {1, 2, 2, 3, 4, 5, 6};
        assertThat(MergeSort.sort(sourceEven, sourceEven.length), is(expectedEven));
        assertThat(MergeSort.sort(sourceOdd, sourceOdd.length), is(expectedOdd));

    }
}