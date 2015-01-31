package adjacencyList;

import java.util.HashSet;
import java.util.HashMap;

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

	
	public HashSet<Vertex> getVertices() { 
		return vertices;
	}

	// return true if there is an edge from v1 to v2
	public boolean getAdjacent(Vertex v1, Vertex v2) {
		for(Edge e : v1.getEdges()) {
			if (e.getVertex() == v2) {
				return true;
			}
		}	
		return false;
	}

	// return hash set of all vertices adjacent to a vertex
	public HashSet<Vertex> getNeighbors(Vertex v) {
		HashSet<Vertex> neighbors = new HashSet<Vertex>();
			
		for (Edge e : v.getEdges()) {
			neighbors.add(e.getVertex());
		}

		return neighbors;

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


	// perform DFS on graph starting at Vertex v
	public void DFS(Vertex v, HashMap<Vertex, Boolean> map) {

		// visit this node	
		System.out.println(v.getId());
		map.put(v, new Boolean(true));

		if (v.getEdges().size() == 0) { 
			return; 
		}
		else {
			for (Edge e : v.getEdges()) {
				// only traverse unvisited nodes
				if (map.get(e.getVertex()).booleanValue() == false) {
					DFS(e.getVertex(), map);
				}
			}
		}

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
