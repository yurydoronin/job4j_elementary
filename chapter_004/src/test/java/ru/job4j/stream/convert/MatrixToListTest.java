package ru.job4j.stream.convert;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 23.05.2019
 */
public class MatrixToListTest {

    /**
     * Test convert.
     */
    @Test
    public void whenMatrixThenList() {
        Integer[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        List<Integer> result = new MatrixToList().convert(matrix);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);
        assertThat(result, is(expected));
    }
}