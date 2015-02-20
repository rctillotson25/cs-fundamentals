
package heaps;



public class Test {


	public static void main(String[] args) throws Exception {
		int[] minVals = {3,7,6,10,12,15};
		int[] maxVals = {15,12,10,6,7,3};
		int[] sortedMaxVals = {3,7,8,10,12,15};

		MaxHeap max1 = new MaxHeap(maxVals.length);
		MaxHeap max2 = new MaxHeap(sortedMaxVals.length);

		max1.buildMaxHeap(maxVals);
		max1.printArray();

		System.out.println();
		max2.buildMaxHeap(sortedMaxVals);
		max2.printArray();

	}

}
