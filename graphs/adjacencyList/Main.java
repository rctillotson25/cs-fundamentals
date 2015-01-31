package adjacencyList;

import java.util.HashSet;

/*
 * Class for testing adjacency list implementation of 
 * graphs. Can probably be used to test other implementations
 * later.
 *
 * Authored on 1/30/2015 by rctillotson25
 *
 * NOTE: This portion of the program does not really follow
 *       any best practices. There is a lot of repetition that
 *       could be reduced for readability. However,
 *       the purpose of this program is to review graphs.
 *       So in that regard, success was had.
 *
 */
public class Main {
	public static void main(String[] args) {
		DirectedGraph g = new DirectedGraph();
		
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);

		v1.addEdge(new Edge(v2));
		v2.addEdge(new Edge(v3));
		v3.addEdge(new Edge(v2));
		v3.addEdge(new Edge(v4));
		v4.addEdge(new Edge(v5));
		v5.addEdge(new Edge(v2));
		
		g.addVertex(v1);
		g.addVertex(v2);
		g.addVertex(v3);
		g.addVertex(v4);
		g.addVertex(v5);
		g.addVertex(v6);

		g.print();

		// Check adjacency correctness
		System.out.println();
		System.out.println("Adjacent v1, v2? " + g.getAdjacent(v1,v2));
		System.out.println("Adjacent v2, v1? " + g.getAdjacent(v2,v1));


		// Check that graph is correct using the neighbors functions
		HashSet<Vertex> hs1 = g.getNeighbors(v1);
		HashSet<Vertex> hs2 = g.getNeighbors(v2);
		HashSet<Vertex> hs3 = g.getNeighbors(v3);
		HashSet<Vertex> hs6 = g.getNeighbors(v6);
		
		System.out.println();
		printSet(v1.getId(), hs1);
		printSet(v2.getId(), hs2);
		printSet(v3.getId(), hs3);
		printSet(v6.getId(), hs6);

	}

	// print hash set of vertices to the conosle 
	private static void printSet(int id, HashSet<Vertex> hs) {
		System.out.print("Neighbors of " + id + ": ");

		for (Vertex v : hs ) {
			System.out.print(v.getId() + " ");
		}
		System.out.println();
	}
}
