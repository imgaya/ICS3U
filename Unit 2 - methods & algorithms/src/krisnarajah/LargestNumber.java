package krisnarajah;
/** LargestNumber.java
 * finds the largest number
 * 03/04/2017
 * @author Gayathiry
 */
public class LargestNumber {

	public static void main(String[] args) {
		int num[] = {300,23,234,44,23523,45,523523,3,343,244};
		System.out.println(getLargestNum(num));
	}

	public static int getLargestNum(int num[]) {
		int maxNum = num[0];
		for (int i = 0; i < num.length; i++) {

			maxNum = Math.max(maxNum, num[i]);
		}
		return maxNum;
	}

}
