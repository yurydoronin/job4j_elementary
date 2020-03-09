package ru.job4j.set.account;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 2.0
 * @since 05.01.2020
 */
public class NotifyAccountTest {

    /**
     * Test NotifyAccount.
     */
    @Test
    public void sent() {
        List<Account> accounts = List.of(
                new Account("123", "Petr Arsentev", "000001"),
                new Account("142", "Petr Arsentev", "000002"),
                new Account("142", "Petr Arsentev", "000002"));
        HashSet<Account> expect = new HashSet<>(List.of(
                new Account("123", "Petr Arsentev", "000001"),
                new Account("142", "Petr Arsentev", "000002")));
        assertThat(NotifyAccount.sent1(accounts), is(expect));
        assertThat(NotifyAccount.sent2(accounts), is(expect));
        assertThat(NotifyAccount.sent3(accounts), is(expect));
        assertThat(NotifyAccount.sent4(accounts), is(expect));
    }
}