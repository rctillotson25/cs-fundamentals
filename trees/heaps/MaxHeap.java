


package heaps;


public class MaxHeap implements Heap {

	private int[] heap;
	private int maxSize;
	private int size;


	public int parent(int i) {
		return i >> 1;
	}

	public int left(int i) {
		return i << 1;
	}

	public int right(int i) {
		return (i << 1) + 1;
	}

	public MaxHeap(int maxSize) {
		this.maxSize = maxSize;
		this.size = 0;
		this.heap = new int[this.maxSize + 1];
		heap[0] = Integer.MAX_VALUE;
	}

	public void insert(int val) {
		heap[++size] = val;
		int current = size;

		while (heap[current] >= heap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}	
	}

	private void swap(int i, int j) {
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}


	public void heapify() {
		return;
	}

	public void print() {
		for (int i = 0; i <= size/2; i++) {
			System.out.println("Parent: " + heap[i] + " Left: " + heap[left(i)] + " Right: " + heap[right(i)]);
		}
	}



}
