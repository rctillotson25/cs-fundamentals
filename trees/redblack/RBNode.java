/*
 * Basic node implementation for Red Black Trees.
 *
 *
 *
 */

package redblack;


public class RBNode {
	
	// Nodes must be either red or black
	public enum Color { RED, BLACK };

	// connected nodes
	private RBNode left;
	private RBNode right;
	private RBNode parent;
	
	// node attributes
	private Color color;
	private int key;
	private String value;

	public RBNode(int key, String value, Color color) {
		this.key = key;
		this.value = value;
		this.color = color;
	}	

	public RBNode(int key, String value) {
		this.key = key;
		this.value = value;
		this.color = Color.BLACK;
	}

	public RBNode left() {
		return left;
	}
	public void setLeft(RBNode left) {
		this.left = left;
	}
	public RBNode right() {
		return right;
	}
	public void setRight(RBNode right) {
		this.right = right;
	}
	public RBNode parent() {
		return parent;
	}
	public void setParent(RBNode parent) {
		this.parent = parent;
	}
	public String value() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int key() {
		return key;
	}
}
