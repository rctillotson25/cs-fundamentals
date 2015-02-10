/*
 * Basic implementation of Merge Sort in Java.
 *
 * Authored on 2/9/2015 by rctillotson25
 *
 */

package algorithms;


public class MergeSort {
	
	public static void main(String[] args) {
		int[] a = {7,6,5,4,3,2,1,0};
		int[] b;

		b = mergeSort(a); 

		System.out.print("Original: ");
		print(a);
		System.out.print("Sorted: " );
		print(b);	
	}


	public static int[] mergeSort(int[] a) {
		if(a.length <= 1) {
			return a;
		}

		int mid = a.length / 2;
		int[] left = get(a, 0, mid);
		int[] right = get(a, mid, a.length);


		left = mergeSort(left);
		right = mergeSort(right);
		return merge(left, right);
	}



	public static int[] merge(int[] left, int[] right) {
		int li = 0;
		int ri = 0;
		int current = 0;
		int[] result = new int[left.length + right.length];
	
		while (li < left.length && ri < right.length) {
			if (left[li] < right[li]) {
				result[current] = left[li];
				li++;
			} else {
				result[current] = right[ri];
				ri++;
			}
			current++;
		}

		while (li < left.length) {
			result[current] = left[li];
			current++;
			li++;
		}

		while (ri < right.length) {
			result[current] = right[ri];
			current++;
			ri++;
		}
		return result;
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
	private static int[] get(int[] a, int start, int end) {
		int[] b  = new int[end-start];

		int counter = 0;
		for (int i = start; i < end; i++) {
			b[counter++] = a[i];
		}
		return b;

	}
}
