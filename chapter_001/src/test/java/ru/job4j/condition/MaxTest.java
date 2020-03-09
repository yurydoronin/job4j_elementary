package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 05.03.2019
 */

public class MaxTest {

    /**
     * Test max.
     */
    @Test
    public void whenMax1And2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    /**
     * Test max.
     */
    @Test
    public void whenMax3And1Then3() {
        Max max = new Max();
        int result = max.max(3, 1);
        assertThat(result, is(3));
    }
}