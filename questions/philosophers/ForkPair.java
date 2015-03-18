package philosophers;

public class ForkPair {

	public Fork firstFork;
	public Fork secondFork;

	public ForkPair(Fork leftFork, Fork rightFork) {
		if (leftFork.id < rightFork.id) {
			firstFork = leftFork;
			secondFork = rightFork;
		} else {
			firstFork = rightFork;
			secondFork = leftFork;
		}
	}

	public void pickup() {
		firstFork.acquire();
		secondFork.acquire();
	}

	public void drop() {
		firstFork.release();
		secondFork.release();
	}
}
