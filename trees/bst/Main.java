package bst;


public class Main {

	public static void main(String[] args) {
		System.out.println("Hello, welcome to the BST practice program!");

		BinarySearchTree tree = new BinarySearchTree();
	
		System.out.println(tree.getRoot());

		tree.put(25, "Hello");
		tree.put(22, "Goodbye.");
		tree.put(27, "Just joking.");
		tree.put(11, "11");
		tree.put(17, "Another");
		tree.put(100, "Hi Alexis");

		tree.printInOrder();

		// null key is caught by compiler
		System.out.println("Get Testing.");
		System.out.println("Present: 25 Value: " + tree.get(25));
		System.out.println("Not present: 1109 Value: " + tree.get(1109));
	}
}
