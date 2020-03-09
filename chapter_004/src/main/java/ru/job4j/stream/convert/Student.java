package ru.job4j.stream.convert;

import java.util.Objects;

/**
 * Class Student.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 20.05.2019
 */
public class Student {

    private String secondName;
    private int score;

    public Student(String secondName, int score) {
        this.secondName = secondName;
        this.score = score;
    }

    public String getSecondName() {
        return secondName;
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
                && Objects.equals(secondName, student.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, secondName);
    }

    @Override
    public String toString() {
        return String.format("%s %s", secondName, score);
    }
}
