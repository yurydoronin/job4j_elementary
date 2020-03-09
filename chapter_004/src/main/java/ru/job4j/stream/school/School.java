package ru.job4j.stream.school;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class School.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 2.0
 * @since 20.05.2019
 */
public class School {

    /**
     * Collecting three classes from students comparing the students' scores.
     *
     * @param students .
     * @param predicate .
     * @return .
     */
    public List<Student> collect(List<Student> students, Predicate<Student> predicate) {
        return students.stream().filter(predicate).collect(Collectors.toList());
    }

    /**
     * Returning the list of students whose score is higher than the bound.
     *
     * @param students .
     * @param bound .
     * @return .
     */
    public List<Student> levelOf(List<Student> students, int bound) {
        return students.stream().flatMap(
                Stream::ofNullable).takeWhile(s -> s.getScore() > bound).collect(Collectors.toList());
    }
}

