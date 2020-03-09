package ru.job4j.bank;

import java.util.*;

/**
 * Class Bank, implements the banking transactions.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 27.03.2019
 */
public class Bank {

    /**
     * A base which includes the users and their accounts.
     */
    private Map<User, List<Account>> bank = new HashMap<>();

    /**
     * Addition the user to the base.
     *
     * @param user, a user.
     */
    public boolean addUser(User user) {
        return this.bank.putIfAbsent(user, new ArrayList<>()) == null;
    }

    /**
     * Removing the user from the base.
     *
     * @param user, a user.
     * @return true if the user has been removed from the collection, otherwise false.
     */
    public boolean deleteUser(User user) {
        return null != this.bank.remove(user);
    }

    /**
     * Getting the user by ID.
     *
     * @param passport, the user's ID.
     * @return the user.
     */
    public User getUserById(String passport) {
        Optional<User> result = this.bank.keySet().stream().
                filter(user -> user.getPassport().equals(passport)).findAny();
        return result.orElse(null);
    }

    /**
     * Addition an account of the specific user to the base of all accounts.
     *
     * @param passport, the user's ID.
     * @param account,  the user's account.
     */
    public void addAccountToUser(String passport, Account account) {
        List<Account> accounts = this.bank.get(this.getUserById(passport));
        accounts.add(account);
    }

    /**
     * Removing an account of the specific user from the base of all accounts.
     *
     * @param passport, the user's ID.
     * @param account,  the user's account.
     */
    public void deleteAccountFromUser(String passport, Account account) {
        List<Account> accounts = this.bank.get(this.getUserById(passport));
        accounts.removeIf(value -> value.equals(account));
    }

    /**
     * Getting all user's account.
     *
     * @param passport, the user's ID.
     * @return the List, the user's accounts.
     */
    public List<Account> getUserAccounts(String passport) {
        return this.bank.get(this.getUserById(passport));
    }

    /**
     * Getting the specific user's account.
     *
     * @param passport,   the user's ID.
     * @param requisites, the account's requisites.
     * @return the user's account.
     */
    public Account getUserOneAccount(String passport, String requisites) {
        Optional<Account> userAccounts = this.getUserAccounts(passport).stream()
                .filter(account -> account.getRequisites().equals(requisites)).findAny();
        return userAccounts.orElse(null);
    }

    /**
     * Transactions between the accounts of the same user or different users.
     *
     * @param srcPassport,   the user's ID.
     * @param srcRequisite,  the account's requisites from which the money is going to transfer.
     * @param destPassport,  the user's ID.
     * @param destRequisite, the account's requisites to which the money is going to transfer.
     * @param amount,        the money.
     * @return true if a transfer has been made, otherwise false.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean result = false;
        Account src = this.getUserOneAccount(srcPassport, srcRequisite);
        Account dest = this.getUserOneAccount(destPassport, destRequisite);
        if (src != null && dest != null) {
            src.subtractAndAddMoney(amount, dest);
            result = true;
        }
        return result;
    }
}
