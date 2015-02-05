package bst;

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
			return true;
		} else if (key < this.key) {
			if (this.left != null) {
				return node.left().remove(this, key);
			} else {
				return false;
			}
		} else if (key > this.key) {
			return node.right().remove(this, key);
		}

	
	}

	private Node findMin(Node node) {
		if (node.left() == null) {
			return node;
		} else {
			return findMin(node.left());
		}
	}
}
