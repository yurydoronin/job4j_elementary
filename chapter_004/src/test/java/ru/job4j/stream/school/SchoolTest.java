package ru.job4j.stream.school;

import org.junit.Test;
import ru.job4j.stream.school.School;
import ru.job4j.stream.school.Student;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 20.05.2019
 */
public class SchoolTest {

    /**
     * Test collect, Class A.
     */
    @Test
    public void whenStudentsThenTreeClassA() {
        List<Student> students = List.of(
                new Student(70),
                new Student(99),
                new Student(55),
                new Student(83),
                new Student(13)
        );
        School school = new School();
        Predicate<Student> condition1 = s -> s.getScore() >= 70 && s.getScore() <= 100;
        List<Student> classA = school.collect(students, condition1);
        List<Student> expectedA = List.of(
                new Student(70),
                new Student(99),
                new Student(83)
        );
        assertThat(classA, is(expectedA));
    }

    /**
     * Test collect, Class B.
     */
    @Test
    public void whenStudentsThenTreeClassB() {
        List<Student> students = List.of(
                new Student(70),
                new Student(69),
                new Student(55),
                new Student(83),
                new Student(13)
        );
        School school = new School();
        Predicate<Student> condition2 = s -> s.getScore() >= 50 && s.getScore() < 70;
        List<Student> classB = school.collect(students, condition2);
        List<Student> expectedB = List.of(
                new Student(69),
                new Student(55)
        );
        assertThat(classB, is(expectedB));
    }

    /**
     * Test collect, Class C.
     */
    @Test
    public void whenStudentsThenTreeClassC() {
        List<Student> students = List.of(
                new Student(70),
                new Student(49),
                new Student(55),
                new Student(33),
                new Student(13)
        );
        School school = new School();
        Predicate<Student> condition3 = s -> s.getScore() >= 0 && s.getScore() < 50;
        List<Student> classC = school.collect(students, condition3);
        List<Student> expectedC = List.of(
                new Student(49),
                new Student(33),
                new Student(13)
        );
        assertThat(classC, is(expectedC));
    }

    /**
     * Test levelOf.
     */
    @Test
    public void whenHigherScoreThanBoundThenListOfStudents() {
        School school = new School();
        List<Student> students = Stream.of(
                new Student("Max", 70),
                new Student("Dasha", 89),
                null,
                null,
                new Student("Mike", 66),
                new Student("Sam", 33),
                null,
                new Student("Nick", 13)).collect(Collectors.toList());
        List<Student> result = school.levelOf(students, 60);
        List<Student> expected = List.of(
                new Student("Max", 70),
                new Student("Dasha", 89),
                new Student("Mike", 66)
        );
        assertThat(result, is(expected));
    }
}