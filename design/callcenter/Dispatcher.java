package callcenter;



public abstract class Dispatcher {
	
	protected boolean available;
	
	protected Dispatcher() {
		this.available = true;
	}

	public boolean isAvailable() { 
		return available;
	}
}
