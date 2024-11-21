import data.Graph;
import logic.GraphLogic;
import output.GraphOutput;

public class Main {

    public static void main(String[] args) {
        GraphLogic graphLogic = new GraphLogic();
        GraphOutput graphOutput = new GraphOutput();

        Graph directedGraph = new Graph(true);
        graphLogic.addVertex(directedGraph, "A", 10);
        graphLogic.addVertex(directedGraph, "B", 20);
        graphLogic.addVertex(directedGraph, "C", 30);

        graphLogic.addEdge(directedGraph, "A", "B");
        graphLogic.addEdge(directedGraph, "B", "C");

        System.out.println("Орієнтований граф:");
        graphOutput.printGraph(directedGraph);

        Graph undirectedGraph = new Graph(false);
        graphLogic.addVertex(undirectedGraph, "X", 50);
        graphLogic.addVertex(undirectedGraph, "Y", 60);
        graphLogic.addVertex(undirectedGraph, "Z", 70);

        graphLogic.addEdge(undirectedGraph, "X", "Y");
        graphLogic.addEdge(undirectedGraph, "Y", "Z");

        System.out.println("\nНеорієнтований граф:");
        graphOutput.printGraph(undirectedGraph);
    }
}
