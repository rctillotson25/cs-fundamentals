package adjacencyList;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Stack;
import java.util.LinkedList;

/*
 *   This class implements a directed graph.
 *
 *   NOTE: it is possible to use the same class 
 *       to implement a weighted graph - just specify the 
 *       weights in the edges. By default they will
 *       be set to -1.
 *
 *   Time complexity of operations:
 *
 *   DFS - Worst Case: O( |V| + |E|) - occurs when all edges for all vertices point to unvisited vertices.
 *   BFS - Worst Case: O( |V| + |E|) - same scenario as DFS.
 *
 *   Insert Edge -   O(1)
 *   Delete Edge -   O(|E|) - must scan all edges to check for presence and remove if needed.
 *   Insert Vertex - O(1)
 *   Delete Vertex - O(|V| + |E|) - finding vertex in HashMap = O(1) if we have reference, O(|V|) otherwise.
 *
 */
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
		System.out.print(v.getId() + " ");
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

	public void DFSIterative(Vertex v, HashMap<Vertex, Boolean> map) {
		Vertex current;
		Stack<Vertex> s = new Stack<Vertex>();
		s.push(v);
		while (!s.empty()) {
			current = s.pop();
			map.put(current, new Boolean(true));
			System.out.print(current.getId() + " ");
			for (Edge e : current.getEdges()) {
				// only push unvisited vertices to stack
				if (map.get(e.getVertex()).booleanValue() == false) {
					s.push(e.getVertex());
				}
			}

		}
	}



	// Implementation of BFS that iterates through the graph starting
	// at Vertex v and prints out the vertices visited
	public void BFSIterative(Vertex v, HashMap<Vertex, Boolean> map) {
		Vertex current;
		LinkedList<Vertex> q = new LinkedList<Vertex>();
		q.add(v);
		while(q.size() > 0) {
			current = q.poll();
			map.put(current, new Boolean(true));
			System.out.print(current.getId() + " ");
			for (Edge e : current.getEdges()) {
				// only add unvisited vertices to queue
				if (map.get(e.getVertex()).booleanValue() == false) {
					q.add(e.getVertex());
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


	// Start of implementation of a connectedComponents algorithm.
	// Given a graph, determine all connected components. 
	public void connectedComponents() {

	}
}
