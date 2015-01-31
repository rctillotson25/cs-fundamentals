package bst;

/*
 *
 *  Basic implementation of a binary search tree.
 *
 */
public class BinarySearchTree {
	private Node root;

	
	public BinarySearchTree() {
		this(null);
	}

	public BinarySearchTree(Node root) {
		this.root = root;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	// initial function for putting new key/value into the tree
	public void put(int key, String value) {
		root = put(root, key, value);
	}

	// recursive function for inserting a new key/value into the tree
	private Node put(Node node, int key, String value) {
		if (node == null) {
			node = new Node(key, value);
		}
		else if (key <= node.key()) {
			node.setLeft(put(node.left(), key, value));
		}
		else {
			node.setRight(put(node.right(), key, value));
		}
		return node;
	}

	public void printInOrder() {
		printInOrder(root);
	}


	// Cases:
	// 1 - empty tree - node is null -> do nothing.
	// 2 - at a leaf -> print out key / value
	// 3 - not at a leaf -> print left, middle, right
	private void printInOrder(Node node) {
		// empty tree case
		if (node == null) {
			return;
		}
		else {
			printInOrder(node.left());
			System.out.println("Key: " + node.key() + " Value: " + node.value());
			printInOrder(node.right());
		}
	}
}
