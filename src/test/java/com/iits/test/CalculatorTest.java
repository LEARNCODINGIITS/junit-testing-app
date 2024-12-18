package com.iits.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.iits.main.Calculator;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {

	static Calculator c;

	@BeforeAll
	static void init() {
		c = new Calculator();
	}

	@AfterAll
	static void cleanOp() {
		c=null;
	}
	@DisplayName("ADD-NEGATIVE-TEST")
	@Order(1)
	@Test
	public void addNegativeValueTest() {

		int acutal = c.add(-10, -10);
		int expected = -1;
		assertEquals(expected, acutal);
		System.out.println("--ADD NEGATIVE TEST CASE--");
	}

	@DisplayName("ADD-ZERO-TEST")
	@Order(2)
	@Test
	public void addZeroValueTest() {

		int acutal = c.add(0, 0);
		int expected = 0;
		assertEquals(expected, acutal);
		System.out.println("--CHECK ZERO TEST CASE--");
	}

	@DisplayName("ADD-POSITIVE-TEST")
	@Order(3)
	@Test
	public void addPositiveValueTest() {

		int acutal = c.add(10, 10);
		int expected = 20;
		assertEquals(expected, acutal);
		System.out.println("--CHECK POSITIVE TEST CASE--");
	}

	@Order(5)
	@Test
	public void multiplicationTest() {

		int acutal = c.multiplication(10, 10);
		int expected = 100;
		assertEquals(expected, acutal);
	}

	@Order(4)
	@Test
	public void subtractionTest() {

		int acutal = c.subtraction(10, 10);
		int expected = 0;
		assertEquals(expected, acutal);
	}

	@Order(6)
	@Test
	public void divisionByZeroTest() {

		// Class<ArithmeticException> ref = ArithmeticException.class;
		// Executable e=()->{
		// throw new ArithmeticException("Division by zero");
		// };
		assertThrows(ArithmeticException.class, () -> c.division(10, 0));
		System.out.println("--DivisionByZero Test Case--");
	}

}
