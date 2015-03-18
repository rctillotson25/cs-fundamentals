package philosophers;

public class Main {


	private static int numPhilosophers = 5;

	private static Fork[] forks;
	public static void main(String[] args) {

		forks = new Fork[numPhilosophers];

		for (int i = 0; i < numPhilosophers; i++) {
			forks[i] = new Fork(i);
		}

		for (int i = 0; i < numPhilosophers; i++) {
			Philosopher p = new Philosopher(i);
			Thread t = new Thread(p);
			t.start();
		}
		
	}
}
