package ru.job4j.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 2.0
 * @since 14.02.2019
 */
public class SortUserTest {

    private final SortUser sortUser = new SortUser();

    /**
     * Test sort.
     */
    @Test
    public void whenListThenSet() {
        List<User> list = Stream.of(
                new User("Yury", 374),
                new User("John", 21),
                new User("Alex", 68)).collect(Collectors.toList());
        Set<User> result = sortUser.sort(list);
        Set<User> expected = Set.of(
                new User("John", 21),
                new User("Yury", 374),
                new User("Alex", 68));
        assertThat(result, is(expected));
    }

    /**
     * Test sortNameLength.
     */
    @Test
    public void whenUsersThenSortNames() {
        List<User> list = Stream.of(
                new User("Сергей", 25),
                new User("Иван", 30),
                new User("Юля", 20),
                new User("Александра", 25)).collect(Collectors.toList());
        sortUser.sortNameLength(list);
        List<User> expected = List.of(
                new User("Юля", 20),
                new User("Иван", 30),
                new User("Сергей", 25),
                new User("Александра", 25));
        assertThat(list, is(expected));
    }

    /**
     * Test sortByAllFields.
     */
    @Test
    public void whenUsersThenSortBothFields() {
        List<User> list = Stream.of(
                new User("Сергей", 25),
                new User("Иван", 30),
                new User("Сергей", 20),
                new User("Иван", 25)).collect(Collectors.toList());
        sortUser.sortByAllFields(list);
        List<User> expected = List.of(
                new User("Иван", 25),
                new User("Иван", 30),
                new User("Сергей", 20),
                new User("Сергей", 25));
        assertThat(list, is(expected));
    }
}