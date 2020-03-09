package ru.job4j.converter;

/**
 * Class Converter, converting Rubles to Dollars and Euros, and vice versa.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 04.03.2019
 */
public class Converter {

    private int rublesPerDollar = 60;
    private int rublesPerEuro = 70;

    /**
     * Method rubleToEuro, converting Rubles to Euros.
     *
     * @param value, Rubles.
     * @return Euros.
     */
    public int rubleToEuro(int value) {
        return value / rublesPerEuro;
    }

    /**
     * Method rubleToDollar, converting Rubles to Dollars.
     *
     * @param value, Rubles.
     * @return Dollars.
     */
    public int rubleToDollar(int value) {
        return value / rublesPerDollar;
    }

    /**
     * Method euroToRuble, converting Euros to Rubles.
     *
     * @param value, Euros.
     * @return Rubles.
     */
    public int euroToRuble(int value) {
        return value * rublesPerEuro;
    }

    /**
     * Method rubleToDollar, converting Dollars to Rubles.
     *
     * @param value, Dollars.
     * @return Rubles.
     */
    public int dollarToRubble(int value) {
        return value * rublesPerDollar;
    }
}