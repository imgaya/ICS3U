package krisnarajah;

import java.util.Scanner;
/**
 * GCF.java
 * GCF Finds the greatest common factor 
 * 05/04/2017
 * @author Gayathiry Krisnarajah
 */
public class GCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number:");
		int first = sc.nextInt();
		System.out.println("Enter your second number:");
		int second = sc.nextInt();
		System.out.print("The greatest common factor of these two numbers is " + gcf(first, second));
	}
	/**
	 * This method finds the greatest common factor between two numbers
	 * 
	 * @param first
	 *            first number
	 * @param second
	 *            second number
	 * @return greatest common factor
	 */
	public static int gcf(int first, int second) {
		if (first > second) {
			for (int i = first; i > 0; i--) {
				if (isDivisible(first, i) == true && isDivisible(second, i)) {
					return i;
				}
			}
		}
		if (second > first) {
			for (int i = second; i > 0; i--) {
				if (isDivisible(first, i) == true && isDivisible(second, i)) {
					return i;
				}
			}
		}
		return first;
	}

	/**
	 * Checks if a is divisible by b
	 * 
	 * @param a
	 *            a number
	 * @param b
	 *            a second number
	 * @return true if divisible, false if not
	 */
	public static boolean isDivisible(int a, int b) {
		if (a % b == 0) {
			return true;
		}
		return false;
	}
}
