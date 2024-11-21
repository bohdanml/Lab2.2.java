package data;

import java.util.HashMap;
import java.util.Map;

public class Graph {
    public final Map<String, Vertex> vertices;
    public final boolean isDirected;

    public Graph(boolean isDirected) {
        this.vertices = new HashMap<>();
        this.isDirected = isDirected;
    }
}
