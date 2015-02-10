/*
 * Basic implementation of Merge Sort in Java.
 *
 * Authored on 2/9/2015 by rctillotson25
 *
 */

package algorithms;


public class MergeSort {
	
	public static void main(String[] args) {
		int[] a = {6,5,4,3,2,1,0};
		int[] b;

		b = mergeSort(a); 

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
	}


	public static int[] mergeSort(int[] a) {
		if(a.length <= 1) {
			return a;
		}

		int mid = a.length / 2;
		int[] left = get(a, 0, mid);
		int[] right = get(a, mid, a.length);

		System.out.println(left.length + " " + right.length);

		left = mergeSort(left);
		right = mergeSort(right);
		return merge(left, right);
	}

	public static int[] merge(int[] left, int[] right) {
		int li = 0;
		int ri = 0;
		int current = 0;
		int[] result = new int[left.length + right.length];
	
		System.out.print("Left:");	
		for (int i = 0; i < left.length; i++) {
			System.out.print(left[i] + " ");
		}

		System.out.print("\nRight:");
		for (int i = 0; i < right.length; i++) {
			System.out.print(right[i] + " ");
		}

		while (li < left.length && ri < right.length) {
			if (li < left.length && ri < right.length) {
				if (left[li] < right[ri]) {
					result[current++] = left[li++];
				} else {
					result[current++] = right[ri++];
				}
			} else if (li < left.length) {
				result[current++] = left[li++];
			} else  {
				result[current++] = right[ri++];
			}
		}
		return result;
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
