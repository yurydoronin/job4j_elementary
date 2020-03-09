package ru.job4j.search;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Class PriorityQueue, .
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 22.04.2019
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * The method has to insert an element in the right position.
     * The position should be defined by the priority field.
     * For the inserting use add(int index, E value).
     *
     * @param task, a task.
     */
    public void put(Task task) {
        ListIterator<Task> liter = tasks.listIterator();
        var count = tasks.size();
        for (var index = 0; index < tasks.size(); index++) {
            if (task.getPriority() < liter.next().getPriority()) {
                count = index;
                break;
            }
        }
        tasks.add(count, task);
    }

    /**
     * Take the head (first element) of this list.
     *
     * @return the head of this list, or null if this list is empty.
     */
    public Task take() {
        return this.tasks.poll();
    }
}
