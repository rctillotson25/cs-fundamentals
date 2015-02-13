/*
 * Basic implementation of Merge Sort in Java.
 *
 * Authored on 2/9/2015 by rctillotson25
 *
 */

package algorithms;


public class MergeSort {
	
	public static void main(String[] args) {
		int[] a = {12,1,54,67,23,42,1,23,6,72,1,0};
		int[] b;

		b = mergeSort(a); 

		System.out.print("Original: ");
		print(a);
		System.out.print("Sorted: " );
		print(b);	
	}

	public static int[] mergeSort(int[] a) {
		if (a.length <= 1) {
			return a;
		}

		int mid = a.length / 2;
		int[] left = split(a, 0, mid);
		int[] right = split(a, mid, a.length);

		left = mergeSort(left);
		right = mergeSort(right);
		return merge(left, right);

	}

	public static int[] merge(int[] left, int[] right) {
		int[] a = new int[left.length + right.length];

		// initialize counters for left, right, and new array
		int l = 0;
		int r = 0;
		int i = 0;

		while((l < left.length) && (r < right.length)) {
			print(a);
			if (left[l] <= right[r]) {
				a[i] = left[l];
				l++;
			} else {
				a[i] = right[r];
				r++;
			}
			i++;
		}

		print(a);

		// move rest of left array into a
		while (l < left.length) {
			a[i] = left[l];
			l++;
			i++;
		}

		// move rest of right array into a
		while (r < right.length) {
			a[i] = right[r];
			r++;
			i++;
		}

		print(a);
		return a;
	}
	
	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]  + " ");
		}
		System.out.println();
	}
	
	/*
	 * Get the values of the array from index start inclusively to index end exclusively.
	 * That is, [start, end); 
	 */ 
	private static int[] split(int[] a, int start, int end) {
		int[] b  = new int[end-start];

		int counter = 0;
		for (int i = start; i < end; i++) {
			b[counter++] = a[i];
		}
		return b;

	}
}
