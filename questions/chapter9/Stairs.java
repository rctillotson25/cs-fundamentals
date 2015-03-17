// Question from CCTI
// 
// Child runs up n stairs 1, 2 or 3 at a time
// how many possible combinations?

package chapter9;


public class Stairs {

	private static int combos = 0;

	public static void main(String[] args) {

		System.out.println(getStairCombos(0));
		System.out.println(getStairCombos(1));
		System.out.println(getStairCombos(2));
		System.out.println(getStairCombos(3));
		System.out.println(getStairCombos(5));
	}

	public static int getStairCombos(int n) {

		if (n == 0) {
			return 1;
		} else if (n < 0) {
			return 0;
		} else {
			return getStairCombos(n - 3) + getStairCombos(n - 2)
				+ getStairCombos(n - 1);
		}
	}
}
