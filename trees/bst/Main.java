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
	}
}
