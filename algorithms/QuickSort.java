/*
 * Implementation of Quick Sort to sort
 * an array in place.
 *
 * Authored on 2/10/2015 by rctillotson25
 *
 */
package algorithms;

public class QuickSort {

	public static void main(String[] args) {
		System.out.println("This is quicksort.");
		int[] a = {0,1,5,6,1,23,65,7,12,23};
		quickSort(a, 0, a.length - 1);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}


	public static void  quickSort(int[] a, int p, int r) {
		if (p < r) {
			int q = partition(a, p, r);
			quickSort(a, p, q - 1);
			quickSort(a, q + 1, r);
		}
	}
	
	public static int partition(int[] a, int p, int r) {
		int x = a[r];
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (a[j] < x) {
				i++;
				swap(a, i, j);	
			}
		}
		swap(a, i + 1, r);
		return i + 1;
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
