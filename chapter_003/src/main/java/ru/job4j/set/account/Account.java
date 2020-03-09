package ru.job4j.set.account;

import java.util.Objects;

/**
 * Class Account.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 05.01.2020
 */
public class Account {

    private String passport;
    private String username;
    private String deposit;

    public Account(String passport, String username, String deposit) {
        this.passport = passport;
        this.username = username;
        this.deposit = deposit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(passport, account.passport);
    }

    @Override
    public int hashCode() {
        return 31 * (this.passport != null ? this.passport.hashCode() : 0);
    }

    @Override
    public String toString() {
        return String.format("Account [passport: %s, username: %s, deposit: %s]",
                passport, username, deposit);
    }
}

