package newGraph;

public class Vertex {

	private int key;
	private int component;

	public Vertex(int key) {
		this.key = key;
	}


	public int getKey() {
		return key;
	}

	public int getComponent() {
		return component;
	}

	public void setComponent(int c) { 
		this.component = c;
	}
}
