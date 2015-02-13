/*
 * Basic implementation of Merge Sort in Java.
 *
 * Authored on 2/9/2015 by rctillotson25
 *
 */

package algorithms;


public class MergeSort2 {
	
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
		int[] left = new int[mid];
		int[] right = new int[a.length - mid];

		// populate left array
		for (int i = 0; i < mid; i++) {
			left[i] = a[i];
		}
	
		// populate right array
		for (int i = mid; i < a.length; i++) {
			right[i - mid] = a[i];
		}

		// divide
		left = mergeSort(left);
		right = mergeSort(right);

		// conquer
		return merge(left, right);

	}	

	public static int[] merge(int[] left, int[] right) {
		int l = 0;
		int r = 0;
		int i = 0;
		int[] a = new int[left.length + right.length];

		while ((l < left.length) && (r < right.length)) {
			if (left[l] <= right[r]) {
				a[i] = left[l];
				l++;
			} else {
				a[i] = right[r];
				r++;
			}
			i++;
		}

		// add remaining values from left
		while (l < left.length) {
			a[i] = left[l];
			l++;
			i++;
		}	

		while (r < right.length) {
			a[i] = right[r];
			r++;
			i++;
		}	

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
