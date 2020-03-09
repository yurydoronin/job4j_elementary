package ru.job4j.sort;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 12.05.2019
 */
public class SortDepartmentsTest {

    @Test
    public void whenArrayOfCodesOfDepartmentsThenAscendingSort() {
        SortDepartments sortDep = new SortDepartments();
        String[] codes = {
                "K1\\SK1",
                "K1\\SK2",
                "K1\\SK1\\SSK1",
                "K1\\SK1\\SSK2",
                "K2",
                "K2\\SK1\\SSK1",
                "K2\\SK1\\SSK2"
        };
        sortDep.addAbsentDeps(codes);
        Set<Department> result = sortDep.sortAscending();
        String[] codesExpected = {
                "K1",
                "K1\\SK1",
                "K1\\SK1\\SSK1",
                "K1\\SK1\\SSK2",
                "K1\\SK2",
                "K2",
                "K2\\SK1",
                "K2\\SK1\\SSK1",
                "K2\\SK1\\SSK2"
        };
        Set<Department> expected = sortDep.addAbsentDeps(codesExpected);
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayOfCodesOfDepartmentsThenDescendingSort() {
        SortDepartments sortDep = new SortDepartments();
        String[] codes = {
                "K1",
                "K1\\SK1",
                "K1\\SK1\\SSK1",
                "K1\\SK1\\SSK2",
                "K1\\SK2",
                "K2",
                "K2\\SK1",
                "K2\\SK1\\SSK1",
                "K2\\SK1\\SSK2"
        };
        Set<Department> departments = sortDep.addAbsentDeps(codes);
        Set<Department> result = sortDep.sortDescending(departments);
        String[] codesExpected = {
                "K2",
                "K2\\SK1",
                "K2\\SK1\\SSK2",
                "K2\\SK1\\SSK1",
                "K1",
                "K1\\SK2",
                "K1\\SK1",
                "K1\\SK1\\SSK2",
                "K1\\SK1\\SSK1"
        };
        Set<Department> expected = sortDep.addAbsentDeps(codesExpected);
        assertThat(result, is(expected));
    }
}