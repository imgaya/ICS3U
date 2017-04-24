package krisnarajah;

import java.util.Scanner;

public class BackwardsSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your sentence");
		String[] sentence = sc.nextLine().split(" ");
		for (int i=0; i<sentence.length; i++){
			for (int j = sentence[i].length()-1; j>=0; j--){
				
				System.out.print(sentence[i].charAt(j));
	}
			System.out.print(" ");
		}
			
	}

}
