/*
 * This class implements a basic doubly linked list node
 * to be used for several example problems.
 *
 * Authored on 2/7/2015 by rctillotson25
 */
package linkedlists;



public class LinkedListNode {

	private LinkedListNode next;
	private LinkedListNode prev;
 	private String data;

	public LinkedListNode(String data) {
		this.data = data;
	}

	public LinkedListNode(LinkedListNode prev, LinkedListNode next, String data) {
		this.prev = prev;
		this.next = next;
		this.data = data;
	}


	public LinkedListNode next() {
		return next;
	}

	public LinkedListNode prev() {
		return prev;
	}

	public String data() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}

	public void setPrev(LinkedListNode prev) {
		this.prev = prev;
	}

}
