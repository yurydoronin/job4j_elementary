package ru.job4j.stream.convert;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 20.05.2019
 */
public class ListToMapTest {

    /**
     * Test collect.
     */
    @Test
    public void whenListThenMap() {
        ListToMap convertList = new ListToMap();
        List<Student> students = List.of(
                new Student("Ivanov", 70),
                new Student("Petrov", 99),
                new Student("Harlamov", 55),
                new Student("Petrova", 83),
                new Student("Ivanova", 13)
        );
        Map<String, Student> result = convertList.convert(students);
        Map<String, Student> expected = Map.of(
                "Ivanov", new Student("Ivanov", 70),
                "Petrov", new Student("Petrov", 99),
                "Harlamov", new Student("Harlamov", 55),
                "Petrova", new Student("Petrova", 83),
                "Ivanova", new Student("Ivanova", 13));
        assertThat(result, is(expected));
    }
}