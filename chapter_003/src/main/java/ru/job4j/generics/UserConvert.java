package ru.job4j.generics;

import java.util.HashMap;
import java.util.List;

/**
 * Class UserConvert, cinverts the List to the HashMap.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 25.04.2019
 */
public class UserConvert {

    /**
     * Converting the List to the HashMap.
     *
     * @param list, .
     * @return .
     */
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> result = new HashMap<>();
        for (User user : list) {
            result.put(user.getId(), new User(user.getId(), user.getName(), user.getCity()));
        }
        return result;
    }
}
