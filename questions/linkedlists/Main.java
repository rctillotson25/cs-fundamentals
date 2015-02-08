/*
 * This class is a quick place to answer linked list questions in CTCI
 * 
 * Authored on 2/7/2015 by rctillotson25
 *
 */

package linkedlists;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the Linked List exercises.");

		LinkedList list = new LinkedList(); 
		list.addFront("1");		
		list.addFront("2");
		list.addFront("2");
		list.addFront("2");
		list.addFront("2");
		list.addFront("2");
		list.addFront("2");
		list.addFront("2");
		list.addFront("2");
		list.addFront("2");
		list.print();
		list.removeDups1();
		list.print();
	}
}
