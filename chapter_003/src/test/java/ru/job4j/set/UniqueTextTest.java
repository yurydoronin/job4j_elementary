package ru.job4j.set;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 2.0
 * @since 05.01.2020
 */
public class UniqueTextTest {

    /**
     * Testing that texts are equal.
     */
    @Test
    public void isEqual() {
        String origin = "My cat eats a mouse";
        String text = "My cat eats a mouse";
        assertThat(UniqueText.isEqual(origin, text), is(true));
    }

    /**
     * Testing that texts are not equal.
     */
    @Test
    public void isNotEqual() {
        String origin = "My cat eats a mouse";
        String text = "A mouse has been eaten by a cat";
        assertThat(UniqueText.isEqual(origin, text), is(false));
    }
}