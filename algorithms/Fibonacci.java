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

		System.out.println("FibDyn 35 = 9227465  - " + fibonacciDynamic(35));
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


	// Dynamic programming method for handling the fibonacci sequence.
	// Optimized dynamic algorithm - O(n) time and O(n) total space. Woot!
	private static int fibonacciDynamic(int n) {

		// a(n-2)
		int a2 = 0;
		// a(n-1)
		int a1 = 1;
	
		// x stores the value originally in a(n-2)
		// set a(n-2) = a(n-1) & a(n-1) = x {a(n-2)} + a(n-1)	
		for (int i = 2; i <= n; i++) {
			int x = a2;
			a2 = a1;
			a1 = a1 + x;
		}
		// a1 is always pointing to the most recently calculated fibonacci number
		return a1;
	}
}
