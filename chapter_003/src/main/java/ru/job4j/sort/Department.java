package ru.job4j.sort;

import java.util.Objects;

/**
 * Class Department.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 12.05.2019
 */
public class Department implements Comparable<Department> {

    private String department;
    private String office;
    private String division;

    public Department(String[] codes) {
        this.department = codes[0];
        if (codes.length == 1) {
            this.office = "";
            this.division = "";
        } else if (codes.length == 2) {
            this.office = codes[1];
            this.division = "";
        } else {
            this.office = codes[1];
            this.division = codes[2];
        }
    }

    @Override
    public int compareTo(Department o) {
        return (this.department + this.office + this.division)
                .compareTo(o.department + o.office + o.division);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Department that = (Department) o;
        return Objects.equals(department, that.department)
                && Objects.equals(office, that.office)
                && Objects.equals(division, that.division);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department, office, division);
    }

    @Override
    public String toString() {
        if (!this.department.equals("") && !this.office.equals("") && !this.division.equals("")) {
            return String.format("%s\\%s\\%s", department, office, division);
        } else if (!this.department.equals("") && !this.office.equals("") && this.division.equals("")) {
            return String.format("%s\\%s", department, office);
        } else {
            return String.format("%s", department);
        }
    }
}
