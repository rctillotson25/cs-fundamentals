package newGraph;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class DirectedGraph {

	private HashMap<Vertex, List<Edge>> vertices;

	public DirectedGraph() {
		vertices = new HashMap<Vertex, List<Edge>>();
	}

	public void BFS(Vertex v) {
		Hashtable<Vertex, Boolean> visited = new Hashtable<Vertex, Boolean>();
	
		// initialize 	
		for (Vertex a : vertices.keySet()) {
			visited.put(a, new Boolean(false));
		}		
	}

	public void addVertex(Vertex v) {
		vertices.put(v, new ArrayList<Edge>());
	}


	public void addEdge(Vertex v1, Vertex v2) {
		addEdge(v1, v2, 0);
	}

	public void addEdge(Vertex v1, Vertex v2, int weight) {
		List<Edge> edges = vertices.get(v1);

		if (edges == null) {
			edges = new ArrayList<Edge>();
		}

		edges.add(new Edge(v2, weight));	
	}
}
