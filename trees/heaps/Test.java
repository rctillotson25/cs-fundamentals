
package heaps;



public class Test {


	public static void main(String[] args) throws Exception {
		int[] minVals = {3,7,6,10,12,15};
		int[] maxVals = {15,12,10,6,7,3};
		MaxHeap max = new MaxHeap(maxVals.length);

		max.buildMaxHeap(maxVals);
		max.printChildren();
		max.print();
		max.printArray();

	}

}
