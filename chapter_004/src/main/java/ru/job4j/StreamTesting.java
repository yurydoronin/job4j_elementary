package ru.job4j;

import java.util.Arrays;

/**
 * Class StreamTesting.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 2.0
 * @since 20.05.2019
 */
public class StreamTesting {

    public static int sum(int... array) {
        return Arrays.stream(array).filter(v -> v % 2 == 0).map(v -> v * v).sum();
    }
}
