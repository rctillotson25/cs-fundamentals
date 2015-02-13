/*
 *
 *
 */

package questions;


import java.util.Scanner;

public class PrefixCalc {

	private static final String ADD = "+";
	private static final String SUBTRACT = "-";
	private static final String 
	public static void main(String[] args) {
		String s = getPrefixExpression();	
		System.out.println(s);
	}

	public static String getPrefixExpression() {
		System.out.println("Enter a prefix expression: ");
		Scanner console = new Scanner(System.in);
		String input = console.nextLine();
		console.close();
		return input;
	}
	
	public static int calculate(String s) {
		String[] tokens = s.split(" ");
		

	} 


}
