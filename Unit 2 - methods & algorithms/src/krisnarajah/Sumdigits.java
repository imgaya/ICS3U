package krisnarajah;

import java.util.Scanner;
/** Sumdigits.java
 * Finds the sum of the users input
 * 05/04/2017
 * @author Gayathiry
 */
public class Sumdigits {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter a number");
		int num = sc.nextInt();
		System.out.println("The sum of your digits is " + sumofDigits(num));
	}
	/**
	 * checks for the sum of the given digits
	 * @param num enters numbers given by user
	 * @return returns sum of the users digits
	 */
	public static int sumofDigits(int num){
		int sum = 0;
		while (num>0 )
		{
			sum = sum + num %10;
			num = num/10;
		}
		return sum;
	}

}
