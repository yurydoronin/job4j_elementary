package ru.job4j.set;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class FullSearch.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 05.01.2020
 */
public class FullSearch {

    /**
     * Extracting numbers from a list and removing duplicates.
     *
     * @param list, list of tasks.
     * @return set with no duplicates.
     */
    public static HashSet<String> extractNumber1(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task task : list) {
            numbers.add(task.getNumber());
        }
        return numbers;

    }

    /**
     * Extracting numbers from a list and removing duplicates.
     *
     * @param list, list of tasks.
     * @return set with no duplicates.
     */
    public static HashSet<String> extractNumber2(List<Task> list) {
        return list.stream().map(Task::getNumber).collect(Collectors.toCollection(HashSet::new));
    }
}
