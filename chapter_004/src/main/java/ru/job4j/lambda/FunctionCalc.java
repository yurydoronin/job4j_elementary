package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

/**
 * Class FunctionCalc, the class for calculating the function in the range.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 09.05.2019
 */
public class FunctionCalc {

    /**
     * Calculating the function in the range.
     *
     * @param start, a number.
     * @param end,   a number.
     * @param func,  the functional interface.
     * @return the List.
     */
    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> result = new ArrayList<>();
        for (int index = start; index < end; index++) {
            result.add(func.apply((double) index));
        }
        return result;
    }
}
