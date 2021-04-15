package org.fizzbuzz.tdd.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	private FizzBuzz fizzBuzz;
	
	@BeforeEach
	public void init() {
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	void testForFizz() {
		assertEquals("fizz", fizzBuzz.calculate(3));
		
	}
	
	@Test
	void testForBuzz() {
		assertEquals("buzz", fizzBuzz.calculate(10));
		
	}
	
	@Test
	void testForNeitherFizzNorBuzz() {
		assertEquals("11", fizzBuzz.calculate(11));
		
	}

}
