package third.adjacenceMatrix;

public class AdjacencyMatrixStudy {
    public static void main(String[] args) {
        AMGraph graph = new AMGraph(5);
        graph.addNode(new AMNode('A'));
        graph.addNode(new AMNode('B'));
        graph.addNode(new AMNode('C'));
        graph.addNode(new AMNode('D'));
        graph.addNode(new AMNode('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(4, 2);
        graph.addEdge(2, 4);
        graph.addEdge(2, 3);
        graph.addEdge(4, 0);

        graph.print();

    }
}
