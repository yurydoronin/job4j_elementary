package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 04.03.2019
 */
public class CalculatorTest  {
    /**
     * Test add.
     */
    @Test
    public void whenAdd1Plus1Then2()  {
        Calculator calc = new Calculator();
        double result = calc.add(1, 1);
        double expected = 2;
        assertThat(result, is(expected));
    }

    /**
     * Test subtract.
     */
	@Test
    public void whenSubtract1From3Then2()  {
        Calculator calc = new Calculator();
        double result = calc.subtract(1, 3);
        double expected = 2;
        assertThat(result, is(expected));
    }

    /**
     * Test div.
     */
	@Test
    public void whenDivide6By2Then3()  {
        Calculator calc = new Calculator();
        double result = calc.div(6, 2);
        double expected = 3;
        assertThat(result, is(expected));
    }

    /**
     * Test multiply.
     */
	@Test
    public void whenMultiply2By2Then4()  {
        Calculator calc = new Calculator();
        double result = calc.multiply(2, 2);
        double expected = 4;
        assertThat(result, is(expected));
    }
}