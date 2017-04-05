package krisnarajah;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		/** Factorial
		 * Finds the factorial of the users number
		 * 04/04/2017
		 * @author Gayathiry
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int scanner = sc.nextInt();
		int answer = factorial(scanner);
		System.out.println(answer);
		
	}

	
	public static int factorial(int num)
	{
		int answer = num;
		for (int i=num-1; i> 0; i--)
		{
			answer = answer* i;
		}
		return answer;
			
				
	}

}
