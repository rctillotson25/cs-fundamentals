package philosophers;

public class Philosopher implements Runnable {


	public int id;

	public Philosopher(int id) {
		super();
		this.id = id;
	}

	public void run() {
		System.out.println("Hello this is Philosopher # " + id);
	}
}
