package adjacencyList;

import java.util.HashSet;

public class Vertex {
	private int id;
	private HashSet<Edge> edges;
	private int component;


	// keep this implementation open for weighted graphs
	// added id variable. -1 for non-weighted
	public Vertex() {
		this(-1);
	}

	public Vertex(int id) {
		this.id = id;
		this.component = 0;
		edges = new HashSet<Edge>();
	}

	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getComponent() {
		return this.component;
	}

	public void setComponent(int component) {
		this.component = component;
	}

	public void addEdge(Edge e) {
		edges.add(e);		
	}

	public HashSet<Edge> getEdges() {
		return this.edges;
	}
}
