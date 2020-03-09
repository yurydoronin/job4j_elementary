package ru.job4j.set.account;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class NotifyAccount.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 05.01.2020
 */
public class NotifyAccount {

    public static HashSet<Account> sent1(List<Account> accounts) {
        return new HashSet<>(accounts);
    }

    public static HashSet<Account> sent2(List<Account> accounts) {
        return accounts.stream().collect(Collectors.toCollection(HashSet::new));
    }

    public static HashSet<Account> sent3(List<Account> accounts) {
        HashSet<Account> result = new HashSet<>();
        for (Account user : accounts) {
            result.add(user);
        }
        return result;
    }

    public static HashSet<Account> sent4(List<Account> accounts) {
        HashSet<Account> result = new HashSet<>();
        result.addAll(accounts);
        return result;
    }
}
