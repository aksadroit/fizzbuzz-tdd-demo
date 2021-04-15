package org.fizzbuzz.tdd.demo;

public class FizzBuzz {

	public String calculate(int number) {
		// TODO Auto-generated method stub
		String result = "";
		
		if (number % 3 == 0) {
			result = "fizz";
		} else if (number % 5 == 0) {
			result = "buzz";
		} else {
			result = String.valueOf(number);
		}
		
		return result;
	}

}
