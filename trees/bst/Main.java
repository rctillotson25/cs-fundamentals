package bst;


public class Main {

	public static void main(String[] args) {
		System.out.println("Hello, welcome to the BST practice program!");

		BinarySearchTree tree = new BinarySearchTree();
	
		insertTesting(tree);

		tree.printInOrder();

		getTesting(tree);

		removeTesting(tree);
}

	/*
	 * Insert Values into a BST.
	 */
	public static void insertTesting(BinarySearchTree tree) { 
		System.out.println("ADDING VALUES TO TREE");
		tree.put(25, "Hello");
		tree.put(22, "Goodbye.");
		tree.put(27, "Just joking.");
		tree.put(11, "11");
		tree.put(17, "Another");
		tree.put(100, "Hi Alexis");
		tree.put(11, "Another 11");
	}

	/*
	 * Test scenarios:
	 * 	Not present
	 * 	Value is a leaf
	 * 	Value is root
	 * 	Value is single child 
	 */
	public static void getTesting(BinarySearchTree tree) {
		System.out.println("STARTING GET TESTING");
		System.out.println("Present: 25 Value: " + tree.get(25));
		System.out.println("Present: 22 Value: " + tree.get(22));
		System.out.println("Present: 100 Value: " + tree.get(100));
		System.out.println("Not present: 1109 Value: " + tree.get(1109));
	}

	public static void removeTesting(BinarySearchTree tree) {
		System.out.println("Remove 22: " + tree.remove(22));
		System.out.println("Remove 25: " + tree.remove(25));
		System.out.println("Remove 21: " + tree.remove(21));
	}
}
