package newGraph;

import java.util.List;

public interface Graph {

	public void addEdge(Vertex v1, Vertex v2);
	public void addVertex(Vertex v1);
	public List<Vertex> BFS(Vertex v);
}
