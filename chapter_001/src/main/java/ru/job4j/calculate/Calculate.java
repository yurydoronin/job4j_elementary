package ru.job4j.calculate;

/**
 * Class Calculate, a string console output.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 28.02.2019
 */
public class Calculate {
    /**
     * Method main, output the string to the console.
     *
     * @param args - args.
     */
    public static void main(String[] args) {
        System.out.println("Apple rules!");
    }

    /**
     * Method echo.
     *
     * @param name, your name.
     * @return Echo plus your name.
     */
    public String echo(String name) {
        return "Echo, echo, echo : " + name;
    }
}