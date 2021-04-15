package org.fizzbuzz.tdd.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void testForFizz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("fizz", fizzBuzz.calculate(3));
		
	}

}
