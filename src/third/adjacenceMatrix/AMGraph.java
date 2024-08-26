package third.adjacenceMatrix;

import java.util.ArrayList;

public class AMGraph {
    ArrayList<AMNode> nodes;
    int[][] matrix;

    AMGraph(int size){
        matrix = new int[size][size];
        nodes = new ArrayList<>();
    }

    public void addNode(AMNode node){
        nodes.add(node);
    }
    public void addEdge(int source, int destination){
        matrix[source][destination] = 1;
    }
    public boolean checkEdge(int source, int destination){
        if(matrix[source][destination] == 1){
            return true;
        }
        else{
            return false;
        }
    }
    public void print(){
        System.out.print("  ");
        for(AMNode node : nodes){
            System.out.print(node.data + " ");
        }
        System.out.println();


        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
