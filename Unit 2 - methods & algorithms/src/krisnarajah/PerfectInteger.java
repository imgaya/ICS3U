package krisnarajah;

public class PerfectInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 100; i++) {

			int sum = 0;
			for (int j = 1; j < i / 2; j++) {
				if (isDivisible(i, j)) {
					sum += j;
				}
			}
			if (sum == i)
				System.out.println("This is a perfect square!");

		}

	}

	public static boolean isDivisible(int a, int b) {
		if (a % b == 0) {
			return true;
		}
		return false;
	}
}
