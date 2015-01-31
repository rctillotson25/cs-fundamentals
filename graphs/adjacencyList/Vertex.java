package adjacencyList;

import java.util.HashSet;

public class Vertex {
	private int id;
	private HashSet<Edge> edges;

	public Vertex() {
		this(-1);
	}

	public Vertex(int id) {
		this.id = id;
		edges = new HashSet<Edge>();
	}

	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void addEdge(Edge e) {
		edges.add(e);		
	}
	public HashSet<Edge> getEdges() {
		return this.edges;
	}
}
