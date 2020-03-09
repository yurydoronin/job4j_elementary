package ru.job4j.stream.convert;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Class ListToMap, .
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 20.05.2019
 */
public class ListToMap {

    /**
     *
     * @param students, .
     * @return .
     */
    public Map<String, Student> convert(List<Student> students) {
        return students.stream().collect(Collectors.toMap(Student::getSecondName, s -> s));
    }
}
