/**
 * This class will be used to implement an algorithm that
 * implements the Fibonacci sequence several different ways.
 *
 * Authored on 2/23/2015 by rctillotson25
 */

package algorithms;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Fib 3  = 3 - " + fibonacciBrute(3));
		System.out.println("Fib 5  = 8 - " + fibonacciBrute(5));
		System.out.println("Fib 35 = 9227465 - " + fibonacciBrute(35));

		System.out.println("Fib 40 = " + fibonacciBrute(40));
	}

	// Classic, recursive method for computing fibonacci numbers. 
	// Wasteful and slow. O(1.6^n) Exponential time.
	private static int fibonacciBrute(int n) {

		if (n == 0) {
		        return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacciBrute(n-1) + fibonacciBrute(n-2);
		}
	}
}
