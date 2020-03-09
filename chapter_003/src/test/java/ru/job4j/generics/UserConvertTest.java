package ru.job4j.generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 24.04.2019
 */
public class UserConvertTest {

    /**
     * Test process.
     */
    @Test
    public void whenListThenMap() {
        UserConvert converter = new UserConvert();
        List<User> list = new ArrayList<>();
        User user1 = new User(12, "Yury", "Sochi");
        User user2 = new User(35, "Any", "Moscow");
        User user3 = new User(98, "Karl", "Toronto");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        Map<Integer, User> result = new HashMap<>();
        result.put(user1.getId(), user1);
        result.put(user2.getId(), user2);
        result.put(user3.getId(), user3);
        HashMap<Integer, User> expect = converter.process(list);
        assertThat(result, is(expect));
    }
}