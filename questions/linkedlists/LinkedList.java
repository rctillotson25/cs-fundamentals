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

	/*
	 * Returns the Kth from last element in a linked list.
	 * O(n) in the worst case.
	 */	
	public String getKth(int k) {

		if (k >= size) {
			return null;
		} else {
			LinkedListNode current = head;
			for (int i = 0; i < size - k; i++) {
				current = current.next();
			}
			return current.data();
		}
	}

	public void remove(LinkedListNode n) {
		if (head == n) {
			// only element in the list
			if (head == tail) {
				head = null;
				tail = null;			
			} else {
				head = head.next();
			}
		} else {
			// already checked to see if head is the element - no need to check here.
			LinkedListNode current = head.next();
			LinkedListNode prev = head;

			while (current != null) {
				if (current == n) {
					prev.setNext(current.next());
					return;				
				} else {
					prev = current;
					current = current.next();
				}
			}
		}

	}

	public void remove(String data) {
		if (head.data().equals(data)) {
			if (head == tail) {
				head = null;
				tail = null;
			} else {
				head = head.next();
				return;
			}
		} else {
			LinkedListNode current = head.next();
			LinkedListNode prev = head;

			while (current != null) {
				if (current.data().equals(data)) {
					prev.setNext(current.next());
					return;
				} else {
					prev = current;
					current = current.next();
				}
			}
		}

	}
}
