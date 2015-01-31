package adjacencyList;

import java.util.HashSet;

public class DirectedGraph {

	// HashSet over TreeSet because the 
	// order the vertices get printed out doesn't
	// really matter. O(1) basic operation with hashset
	// versus the O(lgn) with TreeSet. Order is not preserved. 
	private HashSet<Vertex> vertices;

	// initialize empty graph
	public DirectedGraph() {
		vertices = new HashSet<Vertex>();
	}

	public void addVertex(Vertex v) {
		vertices.add(v);
	}

	// Add edge pointing from v1 to v2
	public void addEdge(Vertex v1, Edge e) {
		v1.addEdge(e);
	}

	// terrible O(n) search algorithm
	public Vertex getVertex(int id) {
		for (Vertex v : vertices) {
			if (v.getId() == id) {
				return v;
			}
		}
		return null;
	}


	public void print() {
		for (Vertex v : vertices) {
			System.out.print("Vertex ID: " + v.getId() + "\t");
			System.out.print("Edges: (start, end, weight): ");
			for(Edge e : v.getEdges()) {
				System.out.print("(" + v.getId() + "," + e.getVertex().getId() + "," + e.getValue() + ") ");
			}
			System.out.println();
		}
	}
}
