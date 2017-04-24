package krisnarajah;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc =  new Scanner (System.in);
		System.out.println("Please enter a word");
		String palindromian =  sc.nextLine();
		boolean elephant = palindrome(palindromian);
	
		
		
		// TODO Auto-generated method stub

	}
	public static boolean palindrome (String pigeon){
		 int elephant = pigeon.length();
		for (int i = 1; i<pigeon.length(); i++){
			if (pigeon.charAt(i) == pigeon.charAt(elephant)) {
			continue;
			else
				
			}
			
		}
	}

}
