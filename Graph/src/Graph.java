import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    public static void main(String[] args) {



        Node node = new Node("F");
        node.addNode(new Node("A"));
        node.addNode(new Node("B"));
        node.addNode(new Node("C"));
        node.addNode(new Node("D"));
        node.addNode(new Node("E"));

        node.addEdge(0,1);
        node.addEdge(1,2);
        node.addEdge(1,4);
        node.addEdge(2,3);
        node.addEdge(2,4);
        node.addEdge(4,0);
        node.addEdge(4,2);

       // node.depthfirstsearch(1);
        node.breadthfirstsearch(0);
        node.print();

    }

}
