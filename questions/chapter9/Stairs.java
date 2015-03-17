// Question from CCTI
// 
// Child runs up n stairs 1, 2 or 3 at a time
// how many possible combinations?

package chapter9;


public class Stairs {

	private static int combos = 0;

	public static void main(String[] args) {

		getStairCombos(0,5);
		System.out.println("n = 5: " + combos);
		combos = 0;
		
		getStairCombos(0,1);
		System.out.println("n = 1: " + combos);
		combos = 0;

		getStairCombos(0,3);
		System.out.println("n = 3 " + combos);

	}

	public static void getStairCombos(int current, int n) {

		if (current >= n) {
			combos += 1;
			return;
		}

		int remaining = n - current;

		if (remaining >= 3) {
			getStairCombos(current + 3, n);
		}
		if (remaining >= 2) {
			getStairCombos(current + 2, n);
		}
		if (remaining >= 1) {
			getStairCombos(current + 1, n);
		}
	}
}
