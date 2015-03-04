package callcenter;


public enum CallHandler {

	INSTANCE;

	private CallHandler() {
	}

	public void print() { System.out.println("Thisinstance.."); }
}
