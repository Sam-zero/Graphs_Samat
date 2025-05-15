import java.util.*;

public class UnweightedGraph<Vertex>  extends WeightedGraph<Vertex> {
    private final Map<Vertex, List<Vertex>> map = new HashMap<>();

    public UnweightedGraph() {
        super(true);
    }

    public UnweightedGraph(boolean undirected) {
        super(undirected);
    }

    public void addVertex(Vertex v) {
        super.addVertex(v);
    }

    public void addEdge(Vertex source, Vertex dest) {
        super.addEdge(source, dest, 1.0);
    }

    public int getVerticesCount() {
        return super.getVerticesCount();
    }

    public int getEdgesCount() {
        return super.getEdgesCount();
    }


    public boolean hasVertex(Vertex v) {
        return super.hasVertex(v);
    }

    public boolean hasEdge(Vertex source, Vertex dest) {
        return super.hasEdge(source, dest);
    }

    public List<Vertex> adjacencyList(Vertex v) {
        return super.adjacencyList(v);
    }
}

