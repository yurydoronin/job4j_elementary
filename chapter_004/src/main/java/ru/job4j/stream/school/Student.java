package ru.job4j.stream.school;

import java.util.Comparator;
import java.util.Objects;

/**
 * Class Student.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 2.0
 * @since 20.05.2019
 */
public class Student implements Comparator<Student> {

    private String name;
    private final int score;

    public Student(int score) {
        this.score = score;
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.score - o2.score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return score == student.score
                && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score);
    }

    @Override
    public String toString() {
        return String.format("Student %s %s", name, score);
    }
}
