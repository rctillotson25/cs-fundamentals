package philosophers;

public class Main {


	private static int numPhilosophers = 5;

	private static Fork[] forks;
	public static void main(String[] args) {

		forks = new Fork[numPhilosophers];

		for (int i = 0; i < numPhilosophers; i++) {
			forks[i] = new Fork(i);
		}

		Fork rightFork, leftFork;
		for (int i = 0; i < numPhilosophers; i++) {

			// left fork is always index
			// right fork is either the index before or the last index
			leftFork = forks[i];
			if (i == 0) {
				rightFork = forks[numPhilosophers - 1];
			} else {
				rightFork = forks[i - 1];
			}

			Philosopher p = new Philosopher(i, new ForkPair(leftFork, rightFork));
			Thread t = new Thread(p);
			t.start();
		}
		
	}
}
