package philosophers;

public class Philosopher implements Runnable {


	public int id;
	private ForkPair fp;

	public Philosopher(int id, ForkPair fp) {
		super();
		this.id = id;
		this.fp = fp;
	}
		
	
	public void run() {
		while (true) {
			fp.pickup();
			System.out.println("Philosopher " + id + " ate.");
			fp.drop();
		}
	}
}
