package ru.job4j.set;

/**
 * Class Task.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 05.01.2020
 */
public class Task {

    private String number;
    private String description;

    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task task = (Task) o;
        return number.equals(task.number);
    }

    @Override
    public int hashCode() {
        return 31 * (this.number != null ? this.number.hashCode() : 0);
    }
}
