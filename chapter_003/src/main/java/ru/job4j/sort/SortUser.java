package ru.job4j.sort;

import java.util.*;

/**
 * Class SortUser, .
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 2.0
 * @since 25.03.2019
 */
public class SortUser {

    /**
     *
     * @param list, .
     * @return the TreeSet.
     */
    public Set<User> sort(List<User> list) {
        return new TreeSet<>(list);
    }

    /**
     *
     * @param list, .
     */
    public void sortNameLength(List<User> list) {
        list.sort(Comparator.comparingInt(user -> user.getName().length()));
    }

    /**
     *
     * @param list, .
     */
    public void sortByAllFields(List<User> list) {
        list.sort(Comparator.comparing(User::getName).thenComparingInt(User::getAge));
    }
}
