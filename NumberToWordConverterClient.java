package com.javacode.test;

import java.util.Scanner;

public class NumberToWordConverterClient {

	public static void main(String[] args) {
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type a number(max upto 9 digits)");
		NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
		try {
			// read the number
			number = scanner.nextInt();
			System.out.print("Number in words: " + numberToWordConverter.numberToWord(number));

		} catch (Exception e) {
			System.out.println("Entered number is not valid. Please enter a valid number.");

		}
		// close the reader
		scanner.close();
	}

}
