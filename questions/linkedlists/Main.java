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
		
		testRemoveDups();
		testGetKth();
	}


	/*
	 * This function will test the remove duplicates functionality.
	 *
	 */
	private static void testRemoveDups() {
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

		System.out.println("Size: " + list.size());
		list.print();
		list.removeDups1();
		System.out.println("Size: " + list.size());
		list.print();
	}

	/*
	 * Test the ability for a linked list to get the kth from last element
	 *
	 */
	private static void testGetKth() {
		LinkedList list = new LinkedList();
		
		list.addFront("5");
		list.addFront("4");
		list.addFront("3");
		list.addFront("2");
		list.addFront("1");
		list.addFront("0");

		System.out.println("Current size: " + list.size());
		list.print();

		// 2nd from last element = 4
		System.out.println("Second from last: " + list.getKth(2));

	}
}
