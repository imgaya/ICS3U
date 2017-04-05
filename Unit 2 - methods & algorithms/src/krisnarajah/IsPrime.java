package krisnarajah;
/** IsPrime
 * determines if the user's number is prime or not prime
 * 05/04/2017
 * @author Gayathiry
 */

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		if (prime(num) == true) {
			System.out.println("This a prime number");
		}

		else {

			System.out.println("This is not a prime number");

		}
	}

	/**
	 * Checks if a is divisible by b
	 * @param a - a number   
	 * @param b - a second number
	 * @return true if divisible, false if not
	 */
	public static boolean isDivisible(int a, int b) {
		if (a % b == 0) {
			return true;
		}
		return false;
	}

	/**
	 * This checks if number is prime or not
	 * 
	 * @param num
	 * num which will be tested if prime or not
	 * @return true if prime, false if not
	 */
	public static boolean prime(int num) {
		for (int i = 2; i < num; i++) {
			if (isDivisible(num, i) == true) {
				return false;
			}
		}
		return true;
	}
}