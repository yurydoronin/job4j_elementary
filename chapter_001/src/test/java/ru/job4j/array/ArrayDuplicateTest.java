package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 08.02.2019
 */
public class ArrayDuplicateTest {

    /**
     * Test remove.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
    ArrayDuplicate duplicate = new ArrayDuplicate();
    String[] array = new String[] {"Привет", "Мир", "Привет", "Супер", "Мир"};
    String[] result = duplicate.remove(array);
    assertThat(result, is(new String[] {"Привет", "Мир", "Супер"}));
    }

    /**
     * Test remove.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicates() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] array = new String[] {"Мир", "Мир", "Труд", "Мир", "Май", "Труд"};
        String[] result = duplicate.remove(array);
        assertThat(result, is(new String[] {"Мир", "Труд", "Май"}));
    }
}