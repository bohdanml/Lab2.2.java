package logic;

import data.Graph;
import data.Vertex;

public class GraphLogic {

    public void addVertex(Graph graph, String name, int value) {
        if (!graph.vertices.containsKey(name)) {
            graph.vertices.put(name, new Vertex(name, value));
        } else {
            System.out.println("Вершина " + name + " вже існує.");
        }
    }

    public void addEdge(Graph graph, String from, String to) {
        Vertex fromVertex = graph.vertices.get(from);
        Vertex toVertex = graph.vertices.get(to);

        if (fromVertex == null || toVertex == null) {
            System.out.println("Одну або обидві вершини не створено.");
            return;
        }

        fromVertex.addNeighbor(toVertex);
        if (!graph.isDirected) {
            toVertex.addNeighbor(fromVertex);
        }
    }
}
