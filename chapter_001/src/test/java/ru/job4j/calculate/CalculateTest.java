package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 28.02.2019
 */
public class CalculateTest {
/**
* Test echo.
*/
	@Test
	public void whenTakeNameThenThreeEchoPlusName() {
		String input = "Yury Doronin";
		String expect = "Echo, echo, echo : Yury Doronin";
		Calculate calc = new Calculate();		
		String result = calc.echo(input); 
		assertThat(result, is(expect));
	}
}