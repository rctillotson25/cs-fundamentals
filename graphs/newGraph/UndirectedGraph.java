package newGraph;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Hashtable;

public class UndirectedGraph implements Graph {

	private HashMap<Vertex, List<Edge>> vertices;

	public UndirectedGraph() {
		vertices = new HashMap<Vertex, List<Edge>>();
	}

	public void addVertex(Vertex v) {
		vertices.put(v, new ArrayList<Edge>());
	}


	public void addEdge(Vertex v1, Vertex v2) {
		addEdge(v1, v2, 0);
	}

	public void addEdge(Vertex v1, Vertex v2, int weight) {
		List<Edge> e1 = vertices.get(v1);
		List<Edge> e2 = vertices.get(v2);

		if (e1 == null || e2 == null) {
			System.out.println("There was no matching vertex pair for this edge.");
		}
		// undirected graph
		e1.add(new Edge(v2, weight));	
		e2.add(new Edge(v1, weight));
	}


	public void connectedComponents() {
		resetComponents();

		int c = 1; /* current component */

	}

	// Reset all components back to default value
	// of component 0.
	private void resetComponents() {
		for (Vertex v : vertices.keySet()) {
			v.setComponent(0);
		}
	}
	public List<Vertex> BFS(Vertex v) {
		
		Hashtable<Vertex, Boolean> visited = new Hashtable<Vertex, Boolean>(); /* track discovered vertices */
		LinkedList<Vertex> q = new LinkedList<Vertex>(); /* queue for BFS */
		LinkedList<Vertex> result = new LinkedList<Vertex>(); /* result list */

		// initialize table of visited vertices
		for (Vertex a : vertices.keySet()) {
			visited.put(a, new Boolean(false));
		}		
		
		Vertex c;
		q.add(v);
		result.add(v);
		visited.put(v, new Boolean(true));

		while (q.size() > 0) { 
			c = q.poll();
		

			for (Edge e : vertices.get(c)) {
				
				// only add unvisited vertices
				if (visited.get(e.getVertex()).booleanValue() == false) {
					q.add(e.getVertex());
					result.add(e.getVertex());
					visited.put(e.getVertex(), new Boolean(true));
				}
			}

		}
		return result;
	}
}
