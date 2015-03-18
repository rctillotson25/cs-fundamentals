package philosophers;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Fork {

	public int id;
	private Lock lock = new ReentrantLock();

	public Fork(int id) {
		this.id = id;
	}

	public void acquire() {
		lock.lock();
	}

	public void release() {
		lock.unlock();
	}
}
