package newGraph;



public class Main {

	public static void main(String[] args) { 
		
		UndirectedGraph graph = new UndirectedGraph();

		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		Vertex v7 = new Vertex(7);

		graph.addVertex(v1);
		graph.addVertex(v2);
		graph.addVertex(v3);
		graph.addVertex(v4);
		graph.addVertex(v5);
		graph.addVertex(v6);
		graph.addVertex(v7);

		graph.addEdge(v1, v2);
		graph.addEdge(v2, v3);
		graph.addEdge(v3, v4);
		graph.addEdge(v4, v2);
		graph.addEdge(v6, v7);

		System.out.println("V1 BFS");
		for (Vertex v : graph.BFS(v1)) {
			System.out.println(v.getKey());
		}

		System.out.println("V6 BFS");
		for (Vertex v : graph.BFS(v6)) {
			System.out.println(v.getKey());
		}
	}
}
