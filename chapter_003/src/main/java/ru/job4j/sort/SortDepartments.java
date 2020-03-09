package ru.job4j.sort;

import java.util.*;

/**
 * Class Department, sorting departments.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 12.05.2019
 */
public class SortDepartments {

    private final Set<Department> deps = new TreeSet<>();

    public Set<Department> addAbsentDeps(String[] codes) {
        Set<String> strings = new TreeSet<>();
        for (String code : codes) {
            String[] line = code.split("\\\\");
            strings.add(line[0]);
            StringJoiner joiner = new StringJoiner("\\\\").add(line[0]);
            for (int i = 1; i < line.length; i++) {
                joiner.add(line[i]);
                strings.add(joiner.toString());
            }
        }
        strings.forEach(s -> deps.add(new Department(s.split("\\\\"))));
        return this.deps;
    }

    public Set<Department> sortAscending() {
        return this.deps;
    }

    public Set<Department> sortDescending(Set<Department> deps) {
        Set<Department> departments = new TreeSet<>(Comparator.reverseOrder());
        departments.addAll(deps);
        return departments;
    }
}
