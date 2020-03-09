package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

/**
 * Class PhoneDictionary, .
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 21.04.2019
 */
public class PhoneDictionary {

    /**
     * A collection.
     */
    private List<Person> persons = new ArrayList<>();

    /**
     * Method add users to the collection.
     *
     * @param person, a user.
     */
    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Method find searches users which contains the key in any fields.
     *
     * @param key, a search key.
     * @return the list of appropriate users.
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        for (var value : persons) {
            if (value.getName().contains(key)
                    || value.getSurname().contains(key)
                    || value.getPhone().contains(key)
                    || value.getAddress().contains(key)) {
                result.add(value);
            }
        }
        return result;
    }
}
