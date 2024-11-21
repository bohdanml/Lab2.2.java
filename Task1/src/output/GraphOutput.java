package output;

import data.Graph;
import data.Vertex;

public class GraphOutput {

    public void printGraph(Graph graph) {
        for (Vertex vertex : graph.vertices.values()) {
            System.out.print(vertex.name + " (" + vertex.value + ") -> ");
            for (Vertex neighbor : vertex.neighbors) {
                System.out.print(neighbor.name + " ");
            }
            System.out.println();
        }
    }
}
