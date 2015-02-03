package questions;

/*
 * This class implements an ATOI functionality.
 *
 * Note that it does not work on IDE's - System.console().readLine() returns null.
 *
 */
public class ATOI {

	public static void main(String[] args) {
		// take in user input
		System.out.print("Enter a number: ");
		String input = System.console().readLine();	
		System.out.println("Number entered: " + input);

		int output = atoi(input);
		System.out.println("Input: " + output + "\nInput + 1: " + (output + 1));
	}

	
	/*
	 * This function will return the integer 
	 * representation of an ASCII value.
	 *
	 * Note that there is very little error checking.
	 */
	public static int atoi(String s) { 
		boolean negative = false;
		int result = 0;
		int i = 0;

		if (s.length() > 0) {
			if (s.charAt(0) == '-') {
				negative = true;
			}

			if(s.charAt(0) == '+' || s.charAt(0) == '-') {
				i = 1;
			}

			for( ; i < s.length(); i++) {	
				result = result * 10 + (s.charAt(i) - '0');
			}
		} 
		return result;
	}
}
