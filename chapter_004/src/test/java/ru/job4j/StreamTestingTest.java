package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 20.05.2019
 */
public class StreamTestingTest {

    /**
     * Test sum.
     */
    @Test
    public void whenThen() {
        int[] array = {1, 2, 3, 4};
        int result = StreamTesting.sum(array);
        assertThat(result, is(20));
    }
}