package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 09.05.2019
 */
public class FunctionCalcTest {

    /**
     * The FunctionCalc object.
     */
    private FunctionCalc function = new FunctionCalc();

    /**
     * Test the Linear Function.
     */
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = this.function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    /**
     * Test the Quadratic Function.
     */
    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = this.function.diapason(5, 8, x -> 2 * Math.pow(x, 2) + 2 * x + 1);
        List<Double> expected = Arrays.asList(61D, 85D, 113D);
        assertThat(result, is(expected));
    }

    /**
     * Test the Logarithmic Function.
     */
    @Test
    public void whenLogarithmicFunctionThenLogarithmicResults() {
        List<Double> result = this.function.diapason(5, 8, Math::log);
        List<Double> expected = Arrays.asList(
                1.6094379124341003D,
                1.791759469228055D,
                1.9459101490553132D);
        assertThat(result, is(expected));
    }
}