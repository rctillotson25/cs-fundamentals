/*
 * Basic implementation of Merge Sort in Java.
 *
 * Authored on 2/9/2015 by rctillotson25
 *
 */

package algorithms;


public class MergeSort {
	
	public static void main(String[] args) {
		int[] a = {0,1,2,3,4,5,6};
		int[] b;

		b = get(a, 0, 3);
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

		System.out.println();
		
		b = get(a, 3, a.length);

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
	}


	public static int[] mergeSort(int[] a) {
		return new int[1];

	}

	/*
	 * Get the values of the array from index start inclusively to index end exclusively.
	 * That is, [start, end); 
	 */ 
	private static int[] get(int[] a, int start, int end) {
		int[] b  = new int[end-start];

		int counter = 0;
		for (int i = start; i < end; i++) {
			b[counter++] = a[i];
		}
		return b;

	}
}
