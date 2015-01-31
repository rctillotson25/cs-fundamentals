package adjacencyList;


public class Main {
	public static void main(String[] args) {
		DirectedGraph g = new DirectedGraph();
		
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);

		v1.addEdge(new Edge(v2));
		v2.addEdge(new Edge(v3));
		v3.addEdge(new Edge(v2));
		v3.addEdge(new Edge(v4));
		
		g.addVertex(v1);
		g.addVertex(v2);
		g.addVertex(v3);
		g.addVertex(v4);
		g.addVertex(v5);

		g.getVertex(1);
		g.print();
	}
}
