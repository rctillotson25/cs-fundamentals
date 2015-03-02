// This program implements the  Sieve of Erastethones to retrieve all primes up to n
//
// Starting at 2, mark every number 2*x <= n
// Starting at next unmarked number, mark every number a * x <= n
// Continue until next unmarked number >= n
package main;

import java.util.ArrayList;

public class Sieve {

	public static void main(String[] args) {
		
	}

	public static List<Integer> sieve(int n) {
	
		// start at 2, go to n -> value is there = marked
		boolean[] arr = new boolean[n + 1];
		
		
		while (i < n) {
		
		}

	}

	// go through the list in arr starting at a. 
	public static boolean[] markMultiples(int a, int n, boolean[] arr) {

		// mark each multiple of a
		for (int i = a; i <= n; i += a) {
			arr[i] = true;
		}
		return arr;
	}	

	public static int getNextUnmarked(int current, boolean[] arr) {
		
		int i = current;
		while (i < arr.length) {
			if (arr[i] == false) {
				return i;
			}
		}

		return -1;
	}
}
