package data;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    public final String name;
    public final int value;
    public final List<Vertex> neighbors;

    public Vertex(String name, int value) {
        this.name = name;
        this.value = value;
        this.neighbors = new ArrayList<>();
    }

    public void addNeighbor(Vertex neighbor) {
        neighbors.add(neighbor);
    }
}
