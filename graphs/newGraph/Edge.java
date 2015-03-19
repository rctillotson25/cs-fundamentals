package newGraph;

public class Edge {

	private int weight;
	private Vertex v;

	public Edge(Vertex v, int weight) {
		this.weight = weight;
		this.v = v;
	}

	public int getWeight() { return weight; }
	public Vertex getVertex() { return v; }

}
