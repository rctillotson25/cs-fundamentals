package adjacencyList;

/*
 *
 * Basic implementation of an edge for weighted graph.
 * This can be used for an unweighted graph as well
 * although it's not space efficient.
 */
public class Edge {


	private Vertex vertex;
	private int value;

	public Edge(Vertex v, int n) {
		vertex = v;
		value = n;
	}
	
	public Edge(Vertex v) { 
		vertex = v;
		value = -1; 
	}

	public Vertex getVertex() {
		return vertex;
	}	

	public int getValue() {
		return value;
	}
}
