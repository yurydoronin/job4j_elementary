package ru.job4j.bank;

import java.util.Objects;

/**
 * Class User.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 27.03.2019
 */
public class User implements Comparable<User> {

    /**
     * A user's name.
     */
    private final String name;

    /**
     * A user's passport.
     */
    private final String passport;

    /**
     * A constructor.
     *
     * @param name,     a user's name.
     * @param passport, a user's passport.
     */
    public User(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    /**
     * Getter.
     *
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter.
     *
     * @return passport.
     */
    public String getPassport() {
        return passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(name, user.name)
                && Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passport);
    }

    @Override
    public int compareTo(User user) {
        int valid = this.name.compareTo(user.name);
        return valid == 0 ? this.passport.compareTo(user.passport) : valid;
    }

    @Override
    public String toString() {
        return String.format("User [Name: %s. Passport: %s.]", name, passport);
    }
}
