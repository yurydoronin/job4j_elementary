package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 04.03.2019
 */
public class ConverterTest {

    /**
     * Test rubleToEuro.
     */
    @Test
    public void when70RublesToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    /**
     * Test rubleToDollar.
     */
    @Test
    public void when60RublesToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    /**
     * Test euroToRuble.
     */
    @Test
    public void when1EuroToRublesThen70() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(1);
        assertThat(result, is(70));
    }

    /**
     * Test dollarToRubble.
     */
    @Test
    public void when1DollarToRublesThen60() {
        Converter converter = new Converter();
        int result = converter.dollarToRubble(1);
        assertThat(result, is(60));
    }
}