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
		// delete the key
	 	// scenario where node has two children
			if (this.right != null && this.left != null) {
				Node min = this.right.findMin();
				System.out.println("The minimum node: " + min.key() + min.value());
				return true;
			}	

			return true;
		} else if (key < this.key) {
			if (this.left != null) {
				return this.left.remove(this, key);
			} else {
				return false;
			}
		} else {
			if (this.right != null) {
				return this.right.remove(this, key);
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
