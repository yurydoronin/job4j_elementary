package ru.job4j.bank;

import java.util.Objects;

/**
 * Class Account.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 27.03.2019
 */
public class Account {

    /**
     * The money.
     */
    private double money;

    /**
     * The account's requisites.
     */
    private final String requisites;

    /**
     * A constructor.
     *
     * @param money,      the money on the user's bank account.
     * @param requisites, the bank account requisites.
     */
    public Account(double money, String requisites) {
        this.money = money;
        this.requisites = requisites;
    }

    /**
     * Getter.
     *
     * @return the money.
     */
    public double getMoney() {
        return money;
    }

    /**
     * Setter.
     *
     * @param money, the money.
     */
    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * Getter.
     *
     * @return requisites.
     */
    public String getRequisites() {
        return requisites;
    }

    /**
     * Operations with the money (subtraction and addition).
     *
     * @param amount, the amount of money which will be transferred from or to the user's account.
     * @param dest,   the account to which the money will be transferred.
     * @return true if operations have been done correctly, otherwise false.
     */
    public boolean subtractAndAddMoney(double amount, Account dest) {
        boolean result = false;
        if (this.getMoney() >= amount) {
            this.money -= amount;
            dest.money += amount;
            result = true;
        }
        return result;
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
        return Double.compare(account.money, money) == 0
                && Objects.equals(requisites, account.requisites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(money, requisites);
    }

    @Override
    public String toString() {
        return String.format("Account [Requisites: %s. Balance: %s.]", requisites, money);
    }
}
