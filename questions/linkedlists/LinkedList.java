/*
 * This class implements a basic doubly-linked list
 * using LinkedListNodes that contain strings.
 *
 * Authored on 2/7/2015 by rctillotson25
 *
 */

package linkedlists;

import java.util.Hashtable;

public class LinkedList {
	
	private LinkedListNode head;
	private LinkedListNode tail;
	private int size;

	public LinkedList() {
		size = 0;
	}

	public int size() {
		return size;
	}

	public LinkedListNode head() {
		return head;
	}

	public LinkedListNode tail() {
		return tail;
	}

	public void addFront(String data) {
		if (head == null) {
			head = new LinkedListNode(data);
			tail = new LinkedListNode(data);
		} else {
			LinkedListNode newNode = new LinkedListNode(data);
			newNode.setNext(head);
			head = newNode;
		}

		size++;
	}

	public void print() {
		if (head == null) {
			return;
		} else {
			print(head);
		}
	}

	private void print(LinkedListNode node) {
		System.out.print(node.data() + " ");
		if (node.next() == null) {
			System.out.println();
			return;
		} else {
			print(node.next());
		}
	}

	public void removeDups1() {
		if (head == null) {
			return;	
		} else {
			Hashtable<String, Boolean> table = new Hashtable<String, Boolean>();
		
			LinkedListNode n = head;
			LinkedListNode prev = null;
			while (n.next() != null) {
				// not currently present
				if (table.get(n.data()) == null) {
					table.put(n.data(), new Boolean(true));
					prev = n;
					n = n.next();
				} else {
					size--;
					prev.setNext(n.next());
					n = n.next();
				}
			}
		}
		
	}

}
