/*
 * Write an algorithm to find the sum of numbers which are smaller than N and divisible by 3 or 5.
 * 
 * - Are these numbers integers?
 * - Any time requirements?
 * - Can I use additional data structures?
 *
 */

package questions;


public class SumOfNumbers {

	public static void main(String[] args) {
		System.out.println(getSumN(10));
		System.out.println(getSumN(12));
		System.out.println(getSumN(100));
		System.out.println(getSumN(1000));
		System.out.println(getSumN(10000));
		System.out.println(getSumN(1000000));
	}
	/*
	 * Return all integers less than n that are
	 * divisible by 5 or 3.
	 */
	public static int getSumN(int n) {
		int sum = 0;	
		for(int i = 0; i < n; i++) {
			// divisible by 5 or 3
			if((i % 3 == 0) || (i % 5 == 0)) {
				sum += i;
			}
		}
		return sum;
	}
}
