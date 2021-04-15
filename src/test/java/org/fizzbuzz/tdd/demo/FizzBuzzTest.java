package org.fizzbuzz.tdd.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void testForFizz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("fizz", fizzBuzz.calculate(3));
		
	}
	
	@Test
	void testForBuzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("buzz", fizzBuzz.calculate(10));
		
	}
	
	@Test
	void testForNeitherFizzNorBuzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("11", fizzBuzz.calculate(11));
		
	}

}
