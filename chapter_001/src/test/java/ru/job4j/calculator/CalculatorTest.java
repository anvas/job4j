package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 *@author Andrey Vasiliev (admsocs@yandex.ru).
 *@version $Id$
 *@since 0.1
 */

public class CalculatorTest {

	/**
	 *Test addition result.
	 */
	@Test
	public void whenAddOnePlusOneThenTwo() {
		Calculator calc = new Calculator();
		calc.add(1D, 1D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(expected));
	}

	/**
	 *Test division result.
	 */
	@Test
	public void whenDivTwoOnTwoThenOne() {
		Calculator calc = new Calculator();
		calc.div(2D, 2D);
		double result = calc.getResult();
		double expected = 1D;
		assertThat(result, is(expected));
	}

	/**
	 *Test subtraction result.
	 */
	@Test
	public void whenSubtractTwoMinusOneThenOne() {
		Calculator calc = new Calculator();
		calc.subtract(2D, 1D);
		double result = calc.getResult();
		double expected = 1D;
		assertThat(result, is(expected));
	}

	/**
	 *Test multiplication result.
	 */
	@Test
	public void whenMultipleTwoOnTwoThenFour() {
		Calculator calc = new Calculator();
		calc.multiple(2D, 2D);
		double result = calc.getResult();
		double expected = 4D;
		assertThat(result, is(expected));
	}
}