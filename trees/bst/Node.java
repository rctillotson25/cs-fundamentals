package bst;


/*
 * Basic Node implementatino for a BST. 
 * Each node can contain a key and some string value.
 *
 * This could be extended with generics later to make a more
 * powerful binary search tree.
 *
 */
public class Node {

	private String value;
	private int key;
	private Node left;
	private Node right;


	public Node (int key, String value) {
		this.key = key;
		this.value = value;
	}

	public String value() {
		return value;
	}

	public int key() {
		return key;
	}
	public Node left() {
		return left;
	}

	public Node right() {
		return right;
	}

	public void setValue(String value) {
		this.value = value;	
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public boolean remove(Node parent, int key) { 
		if (this.key == key) {
			// Node has two children
			if (this.right != null && this.left != null) {
				Node min = this.right.findMin();
				this.key = min.key();
				this.value = min.value();
				right.remove(this, key);
			} else if (parent.right == this) {
				if (right != null) {
					parent.right = right;
				} else {
					parent.right = left;
				}
			} else if (parent.left == this) {
				if (right != null) {
					parent.left = right;
				} else {
					parent.left = left;
				}
			}
			return true;
		} else if (key < this.key) {
			if (this.left != null) {
				return this.left.remove(this, key);
			// node not found
			} else {
				return false;
			}
		} else {
			if (this.right != null) {
				return this.right.remove(this, key);
			// node not found
			} else {
				return false;
			}
		}
	}

	private Node findMin() {
		if (left == null) {
			return this;
		} else {
			return left.findMin();
		}
	}
}
