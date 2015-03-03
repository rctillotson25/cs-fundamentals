// This program implements the  Sieve of Erastethones to retrieve all primes up to n
//
// Starting at 2, mark every number 2*x <= n
// Starting at next unmarked number, mark every number a * x <= n
// Continue until next unmarked number >= n
package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Sieve {

	public static void main(String[] args) {

		for (Integer i : sieve(100000)) {
			System.out.println(i.intValue());
		}
	}

	public static List<Integer> sieve(int n) {
	
		// start at 2, go to n -> value is there = marked
		boolean[] arr = new boolean[n + 1];
		
		arr[0] = true;
		
		// 1 is not prime by definition
		if (arr.length > 1) {
			arr[1] = true;
		}

		int i = 2;
		while (i < n) {
			arr = markMultiples(i, arr);
			i = getNextUnmarked(++i, arr);

			// next i exceeds n
			if (i == -1)  { 
				break;
			}
		}

		return getUnmarked(arr);
	}

	// Return the list of indices that are not marked (true).
	public static List<Integer> getUnmarked(boolean[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == false) {
				list.add(new Integer(i));
			}
		}
		return list;
	}

	// go through the list in arr starting at a. 
	public static boolean[] markMultiples(int a, boolean[] arr) {
		
		// mark each multiple of a starting with 2a
		for (int i = (2*a); i < arr.length; i += a) {
			arr[i] = true;
		}
		return arr;
	}	

	public static int getNextUnmarked(int current, boolean[] arr) {
		
		while (current < arr.length) {
			if (arr[current] == false) {
				return current;
			}
			current++;
		}

		return -1;
	}

}
