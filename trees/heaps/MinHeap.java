/*
 * This class will hold a minimum heap.
 *
 * 
 */

package heaps;


public class MinHeap implements Heap {

	private int[] heap;
	private int size;
	private int maxSize;

	public MinHeap(int maxSize) {
		this.maxSize = maxSize;
		this.heap = new int[maxSize];
		this.size = 0;

	}
	@Override
	public void heapify(int i) {
		return;
	}

	public void buildMinHeap() {

	}	

	public void printArray() {

	}

	public void print() {

	}
}
