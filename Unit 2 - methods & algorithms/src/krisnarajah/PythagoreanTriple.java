package krisnarajah;
/** PythagoreanTriple
 * Displays the pythagorean triples of the a & b value 
 * @author 323906552
 *20/04/2017
 */


public class PythagoreanTriple {

	public static void main(String[] args) {
		int a =1;
			for (int b = 1; a <100; b++){
				int c = (int) (Math.pow(a, 2)+ Math.pow(b,2));
				if(perfectSquare(c) == true ){
					System.out.println(a +" "+ b +" " +  (int) Math.sqrt(c));
				}
				if ( b == 100){
					b = 1;
					a++;
				}
			}
				
	
	}
	/**
	 * Checks if the value is a perfect square or not
	 * @param a
	 * @return
	 */
	
	
	public static boolean perfectSquare(int a) {

		int srt = (int) Math.sqrt(a);
		double check = Math.pow(srt, 2);
		if (a == check) {
			return true;
		} else {
			return false;
		}
	}

}
