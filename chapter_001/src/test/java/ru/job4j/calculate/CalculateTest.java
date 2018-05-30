package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 *@author Andrey Vasiliev (admsocs@yandex.ru)
 *@version $Id$
 *@since 0.1
 */
 
public class CalculateTest {
	/**
	 *Test echo.
	 */
	@Test
	public void whenTakeNameThenTreeEchoPlusName() {
		String input = "Andrey Vasiliev";
		String expect = "Echo, echo, echo : Andrey Vasiliev";
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}

}