


package heaps;


public class MaxHeap implements Heap {

	private int[] heap;
	private int maxSize;
	private int size;


	public int parent(int i) {
		return i >> 1;
	}

	public int left(int i) {
		return (i << 1) + 1;
	}

	public int right(int i) {
		return (i << 1) + 2;
	}

	public MaxHeap(int maxSize) {
		this.maxSize = maxSize;
		this.size = 0;
		this.heap = new int[maxSize];
	}

	// Initial implementation: build a max heap from an input array
	// that is already a heap.
	// O(n)
	public void buildMaxHeap(int[] arr) throws HeapInputException {
		if (arr.length > maxSize) {
			throw new HeapInputException("Length of input array > maxSize. length: " + arr.length + " maxSize: " + maxSize);		
		}
		for (int i = 0; i < (arr.length >> 1); i++) {
			heap[i] = arr[i];
			size++;
		}
	}
	
	// swap the integers in the heap 
	private void swap(int i, int j) {
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}

	public void printChildren() {
		System.out.println("Root:  0 - Value: " + heap[0]);
		System.out.println("Left: " + left(0) + " - Value: " + heap[left(0)]);
		System.out.println("Right: " + right(0) + " - Value: " + heap[right(0)]);
	}

	// Max-Heapify Algorithm
	// 
	// Assumes that the rest of the tree is in the proper order.
	// Will propagate downward until the max-heap property is 
	// met for the node at i
	@Override
	public void heapify(int i) {
		int left = left(i);
		int right = right(i);
		int largest = i;
		
		if ((left < size) && (heap[left] > heap[largest])) {
			largest = left;
		}
		if ((right < size) && (heap[right] > heap[largest])) {
			largest = right;
		}
		// need to heapify the rest
		if (largest != i) {
			swap(i, largest);
			heapify(largest);
		}
	}

	public void print() {
		for (int i = 0; i <= size/2; i++) {
			System.out.println("Parent: " + heap[i] + " Left: " + heap[left(i)] + " Right: " + heap[right(i)]);
		}
	}

	public void printArray() {
		System.out.print("[");
		for (int i = 0; i < size; i++) {
			System.out.print(i + " ");
		}
		System.out.print("]");
	}

	public class HeapInputException extends Exception {

		public HeapInputException(String message) {
			super(message);
		}
	}

}
